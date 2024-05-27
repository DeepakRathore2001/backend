package com.medassist.prescription.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medassist.prescription.model.NewPrescription;
import com.medassist.prescription.model.Prescription;

public interface NewPrescriptionRepository  extends JpaRepository<NewPrescription, Long> {
	
}
