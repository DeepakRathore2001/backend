package com.medassist.prescription.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NewPrescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="patientid")
    private Long patientId;
    @Column(name="patientname")
    private String patientName;
    @Column(name="address")
    private String address;
    @Column(name="dob")
    private String dob;
    @Column(name="sex")
    private String sex;
    @Column(name="phonenumber")
    private String phoneNumber;
    @Column(name="healthinsuranceno")
    private String healthInsuranceNo;
	@Column(name="healthcardno")
	private String healthCardNo;
	@Column(name="allergies")
    private String allergies;
	@Column(name="disabilities")
    private String disabilities;
	@Column(name="doctorname")
    private String doctorName;
	@Column(name="doctorspecialization")
    private String doctorSpecialization;
	@Column(name="hospitalname")
    private String hospitalName;
	@Column(name="date")
    private String date;
	@Column(name="prescriptions")
    private String prescriptions;
	@Column(name="issignaturechecked")
    private boolean isSignatureChecked;

    public NewPrescription() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewPrescription(Long id, Long patientId, String patientName, String address, String dob, String sex,
			String phoneNumber, String healthInsuranceNo, String healthCardNo, String allergies, String disabilities,
			String doctorName, String doctorSpecialization, String hospitalName, String date, String prescriptions,
			boolean isSignatureChecked) {
		super();
		this.id = id;
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
		this.dob = dob;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.healthInsuranceNo = healthInsuranceNo;
		this.healthCardNo = healthCardNo;
		this.allergies = allergies;
		this.disabilities = disabilities;
		this.doctorName = doctorName;
		this.doctorSpecialization = doctorSpecialization;
		this.hospitalName = hospitalName;
		this.date = date;
		this.prescriptions = prescriptions;
		this.isSignatureChecked = isSignatureChecked;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHealthInsuranceNo() {
		return healthInsuranceNo;
	}
	public void setHealthInsuranceNo(String healthInsuranceNo) {
		this.healthInsuranceNo = healthInsuranceNo;
	}
	public String getHealthCardNo() {
		return healthCardNo;
	}
	public void setHealthCardNo(String healthCardNo) {
		this.healthCardNo = healthCardNo;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getDisabilities() {
		return disabilities;
	}
	public void setDisabilities(String disabilities) {
		this.disabilities = disabilities;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}
	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPrescriptions() {
		return prescriptions;
	}
	public void setPrescriptions(String prescriptions) {
		this.prescriptions = prescriptions;
	}
	public boolean isSignatureChecked() {
		return isSignatureChecked;
	}
	public void setSignatureChecked(boolean isSignatureChecked) {
		this.isSignatureChecked = isSignatureChecked;
	}


    // Getters and setters
}
