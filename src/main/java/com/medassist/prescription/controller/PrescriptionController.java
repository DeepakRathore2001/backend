package com.medassist.prescription.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.medassist.prescription.model.NewPrescription;
import com.medassist.prescription.model.Patient;
import com.medassist.prescription.service.PrescriptionService;

import exceptionHandling.ResourceNotFoundException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PrescriptionController {

    @Autowired
    PrescriptionService prescriptionService;

    @GetMapping("/getPatientDetails")
    public ResponseEntity<?> getPatientDetails(@RequestHeader("patientid") Long patientId) {
        Optional<Patient> patient = prescriptionService.getPatientDetails(patientId);
        if (patient.isPresent()) {
            return ResponseEntity.ok(patient);
        } else {
            throw new Error("Patients not available");
        }
    }

    @GetMapping("/getReportResult")
    public ResponseEntity<?> getReportResult(@RequestHeader("Authorization") String token,
                                              @RequestHeader("prompt") String prompt) throws Exception {
        return ResponseEntity.ok(prescriptionService.getReportResult(token, prompt));
    }

    @PostMapping("/save")
    public ResponseEntity<?> savePrescription(@RequestBody NewPrescription prescription) {
        NewPrescription savedPrescription = prescriptionService.savePrescription(prescription);
        return ResponseEntity.ok(savedPrescription);
    }

    @GetMapping("/veiwAllPrescription")
    public ResponseEntity<?> viewAllPrescriptions() {
        List<NewPrescription> prescriptions = prescriptionService.getAllPrescriptions();
        return ResponseEntity.ok(prescriptions);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletePrescription(@PathVariable Long id) {
        try {
            prescriptionService.deletePrescription(id);
            return ResponseEntity.ok().build();
        } catch (ResourceNotFoundException ex) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ex.getMessage());
        }
    }

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public ResponseEntity<ApiError> handleResourceNotFoundException(ResourceNotFoundException ex) {
//        ApiError apiError = new ApiError(HttpStatus.NOT_FOUND, ex.getMessage());
//        return new ResponseEntity<>(apiError, HttpStatus.NOT_FOUND);
//    }
}


