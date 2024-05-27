package com.medassist.prescription.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medassist.prescription.model.Patient;
import com.medassist.prescription.model.Prescription;
@Repository
public interface  PatientRepository extends CrudRepository<Patient,Long >{
//	public Optional<Patient> findByPatientid(Long patientid);
	

}
