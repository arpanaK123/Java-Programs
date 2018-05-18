package com.bridgeit.ClinicController;

import java.util.List;

import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

public interface SearchDeatails {

	public void searchDoctorByName(List<Doctor> doctorList);

	public void searchDoctorByID(List<Doctor> doctorList);

	public void searchDoctorBySpecialization(List<Doctor> doctorList);

	public void searchDoctorByAvailability(List<Doctor> doctorList);

	public void searchPatientByName(List<Patient> patientList);

	public void searchPatientByID(List<Patient> patientList);

	public void searchPatientByMobileNumber(List<Patient> patientList);

}
