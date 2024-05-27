package com.medassist.prescription.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "prescription")
public class Prescription {
    public Prescription() {
		super();
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
@Column(name="patientname")
    private String patientName;
@Column(name="date")// Renamed to follow Java naming conventions (camelCase)
    private String date;
@Column(name="doctorname")
    private String doctorName; 
@Column(name="medicine")// Renamed for consistency
    private String medicine;
@Column(name="healthinsuranceno")
    private String healthinsuranceno;
@Column(name="doctorid")
    private Long doctorid;
@Column(name="patientid")
    private Long patientid;
    

    public Prescription(Long id, String patientName, String date, String doctorName, String medicine,
			String healthinsuranceno, Long doctorid, Long patientid) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.date = date;
		this.doctorName = doctorName;
		this.medicine = medicine;
		this.healthinsuranceno = healthinsuranceno;
		this.doctorid = doctorid;
		this.patientid = patientid;
	}

	// Constructors (if needed)

    public String getHealthinsuranceno() {
		return healthinsuranceno;
	}

	public void setHealthinsuranceno(String healthinsuranceno) {
		this.healthinsuranceno = healthinsuranceno;
	}

	public Long getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(Long doctorid) {
		this.doctorid = doctorid;
	}

	public Long getPatientid() {
		return patientid;
	}

	public void setPatientid(Long patientid) {
		this.patientid = patientid;
	}

	// Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    // Other methods (if needed)
}
