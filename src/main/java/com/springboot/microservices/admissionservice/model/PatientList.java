package com.springboot.microservices.admissionservice.model;

import java.util.List;

public class PatientList {

	private List<Patient> patient;

	public List<Patient> getPatients() {
		return patient;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	
	
}
