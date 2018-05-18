package com.bridgeit.ClinicController;

import java.util.List;

import com.bridgeit.ClinicManagementPozo.Appointment;
import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

public interface DisplayDetails {
	public void displayDoctorList(List<Doctor> doctorList);

	public void displayPatientList(List<Patient> patientList);

	public void displayAppointmentList(List<Appointment> appointmentList);

	public void dispalyPopularDoctor(List<Doctor> doctorList);

	public void dispalyPopularSpecialization(List<Doctor> doctorList);
}
