package com.medassist.prescription.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="patient")
public class Patient {
	
	@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	 
		
		
		private String patientname;
		private String address;
		private String dob;
		private String sex;
		private String phonenumber;
		private String healthinsuranceno;
		private String healthcardno;
		private String Allergies;
		private String Disabilities;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getPatientname() {
			return patientname;
		}
		public void setPatientname(String patientname) {
			this.patientname = patientname;
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
		public String getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}
		public String getHealthinsuranceno() {
			return healthinsuranceno;
		}
		public void setHealthinsuranceno(String healthinsuranceno) {
			this.healthinsuranceno = healthinsuranceno;
		}
		public String getHealthcardno() {
			return healthcardno;
		}
		public void setHealthcardno(String healthcardno) {
			this.healthcardno = healthcardno;
		}
		public String getAllergies() {
			return Allergies;
		}
		public void setAllergies(String allergies) {
			Allergies = allergies;
		}
		public String getDisabilities() {
			return Disabilities;
		}
		public void setDisabilities(String disabilities) {
			Disabilities = disabilities;
		}
		public Patient(Long id, String patientname, String address, String dob, String sex, String phonenumber,
				String healthinsuranceno, String healthcardno, String allergies, String disabilities) {
			super();
			this.id = id;
			this.patientname = patientname;
			this.address = address;
			this.dob = dob;
			this.sex = sex;
			this.phonenumber = phonenumber;
			this.healthinsuranceno = healthinsuranceno;
			this.healthcardno = healthcardno;
			Allergies = allergies;
			Disabilities = disabilities;
		}
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		}
		



		
}
