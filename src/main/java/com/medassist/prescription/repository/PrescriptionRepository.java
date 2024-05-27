package com.medassist.prescription.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.medassist.prescription.model.Prescription;
@Repository

public interface  PrescriptionRepository extends CrudRepository<Prescription,Long >{
//	public Optional<Patient> findByPatientid(Long patientid);
	@Query(value="Select p from Prescription p where p.patientid=?1 Or p.doctorid=?1 " )
	public Prescription findByPatientidOrDoctorid(String search);

}
