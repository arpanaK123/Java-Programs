package com.bridgeit.ClinicController;

import java.util.List;

import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

import Com.bridgeit.ClinicUtility.Utility;

public class SearchDetailsImplement implements SearchDeatails {

	// Function to search the Doctor By Name from the list
	@Override
	public void searchDoctorByName(List<Doctor> doctorList) {
		Utility utility = new Utility();
		System.out.println("Enter Doctor name to be search");
		String name = utility.inputSring();
		int count = 0;

		for (Doctor doctor : doctorList) {
			if (doctor.getDoctorName().equals(name)) {
				System.out.println("Doctor Found\t " + doctor.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor not found in this clinic");
		}

	}

	// Function to search the Doctor by ID from the file
	@Override
	public void searchDoctorByID(List<Doctor> doctorList) {
		Utility utility = new Utility();
		System.out.println("Enter Doctor ID to be search");
		int id = utility.inputInteger();
		int count = 0;
		for (Doctor doctor : doctorList) {
			if (doctor.getDoctorId() == id) {
				System.out.println("Doctor Found\t :" + doctor.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor not found in this clinic");
		}
	}

	// Function to search the Doctor by Specialization from the file
	@Override
	public void searchDoctorBySpecialization(List<Doctor> doctorList) {
		Utility utility = new Utility();

		System.out.println("Enter Doctor Specialization");
		String specialization = utility.inputSring();
		int count = 0;
		for (Doctor doctor : doctorList) {
			if (doctor.getDoctorSpecialization().equals(specialization)) {
				System.out.println("Doctor Found \t: " + doctor.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor not found in this clinic");
		}
	}

	// Function to search the Doctor by Available time
	@Override
	public void searchDoctorByAvailability(List<Doctor> doctorList) {
		Utility utility = new Utility();

		System.out.println("Enter Doctor Available time \n\t1. AM \n\t2. PM\n\t3. Both");
		String available = utility.inputSring();
		System.out.println("Enter your choice");
		int choice = utility.inputInteger();
		int count = 0;
		for (Doctor doctor : doctorList) {
			if (doctor.getDoctorAvailability().equals(available)) {
				System.out.println("Doctor Available\t:" + doctor.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor not available in this time");
		}

	}

	// Function to search the Patient by name from the file
	@Override
	public void searchPatientByName(List<Patient> patientList) {
		Utility utility = new Utility();

		System.out.println("Enter Patient Name");
		String name = utility.inputSring();
		int count = 0;
		for (Patient patient : patientList) {
			if (patient.getPatientName().equals(name)) {
				System.out.println("Patient Found\t:" + patient.toString());
				count++;

			}
		}
		if (count == 0) {
			System.out.println("Patient not found");
		}
	}

	// Function to search the Patient by Id from the file
	@Override
	public void searchPatientByID(List<Patient> patientList) {
		Utility utility = new Utility();

		System.out.println("Enter Patient id");
		int id = utility.inputInteger();
		int count = 0;
		for (Patient patient : patientList) {
			if (patient.getPatientId() == id) {
				System.out.println("Patient Found\t:" + patient.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Patient not found in this clinic");
		}
	}

	// Function to search the Patient by Mobile Number from the file
	@Override
	public void searchPatientByMobileNumber(List<Patient> patientList) {
		Utility utility = new Utility();
		System.out.println("Enter Patient Mobile Number");
		String mobileNumber = utility.inputSring();
		int count = 0;
		for (Patient patient : patientList) {
			if (patient.getPatientMobNum().equals(mobileNumber)) {
				System.out.println("Patient Found\t: " + patient.toString());
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Patient not found in this clinic");
		}
	}

}
