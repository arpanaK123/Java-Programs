package com.bridgeit.ClinicController;

import java.util.List;

import com.bridgeit.ClinicManagementPozo.Appointment;
import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

import Com.bridgeit.ClinicUtility.Utility;

public class DisplayDetailsImplement implements DisplayDetails {

	// Function to Display Doctor Details from the file
	@Override
	public void displayDoctorList(List<Doctor> doctorList) {
		for (Doctor doctor : doctorList) {
			System.out.println();
			System.out.println("Doctor List: \n\t" + doctor.toString());
		}

	}

	// Function to display the Patient list from the file
	@Override
	public void displayPatientList(List<Patient> patientList) {
		for (Patient patient : patientList) {
			System.out.println();
			System.out.println("Patient list:\n\t" + patient.toString());
		}
	}

	// Function to Display the Appointment Details from the file
	@Override
	public void displayAppointmentList(List<Appointment> appointmentList) {

		for (Appointment appointment : appointmentList) {
			System.out.println();
			System.out.println("Appointment List:\n\t" + appointment.toString());
		}
	}

	// Function to display the Popular Doctor From the file
	@Override
	public void dispalyPopularDoctor(List<Doctor> doctorList) {

		for (Doctor doctor : doctorList) {
			if (doctor.getNumberOfPatient() == 5) {
				System.out.println("Popular Doctors:\n\t" + doctor.toString());
			}
		}
	}

	// Function to display the Popular Specialization from the file
	@Override
	public void dispalyPopularSpecialization(List<Doctor> doctorList) {
		for (Doctor doctor : doctorList) {
			if (doctor.getNumberOfPatient() == 5) {
				System.out.println("Popular Doctor Specialization:\n\t" + doctor.getDoctorSpecialization());
			}
		}
	}

}
