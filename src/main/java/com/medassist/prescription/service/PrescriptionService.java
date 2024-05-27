package com.medassist.prescription.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.medassist.prescription.model.NewPrescription;
import com.medassist.prescription.model.Patient;
import com.medassist.prescription.model.Prescription;
import com.medassist.prescription.repository.NewPrescriptionRepository;
import com.medassist.prescription.repository.PatientRepository;
import com.medassist.prescription.repository.PrescriptionRepository;


@Service

public class PrescriptionService {
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	PrescriptionRepository prescriptionRepository;
	@Autowired
	NewPrescriptionRepository nRepository;
	@Autowired
	RestTemplate restTemplate;


	public Optional<Patient> getPatientDetails(Long id) {
		return patientRepository.findById(id);
	}
	public NewPrescription savePrescription(NewPrescription prescription) {
        return nRepository.save(prescription);
    }
	
	public ArrayList<String> getReportResult(String token, String prompt) throws Exception {
		String url = "http://localhost:8081/api/medassist/generatePrescription";
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", token);
		headers.set("prompt", prompt);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		ArrayList<String> data = new ArrayList<String>();
		try {
			ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
			String response = responseEntity.getBody();
			ObjectMapper objectMapper = new ObjectMapper();

			try {
				JsonNode rootNode = objectMapper.readTree(response);
				JsonNode dataNode = rootNode.get("data");
				if (dataNode != null) {
					data.add(dataNode.asText());
				}
			} catch (Exception e) {
				throw e;
			}
		} catch (ResourceAccessException e) {
			throw e;
		}
		return data;
	}

	public String saveReport(Prescription prescription) {
		prescriptionRepository.save(prescription);
		return "Report saved successfully";
	}
	
	public List<NewPrescription> getAllPrescriptions() {
		return  nRepository.findAll();
				};
	public Prescription getReport(String search) {
		return prescriptionRepository.findByPatientidOrDoctorid(search);
		
	}
	 public void deletePrescription(Long id) {
	        nRepository.deleteById(id);
	    }
}
