package com.bridgeit.ClinicManagement;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class ClinicManagement {

	String doctorName;
	String doctorId;
	String doctorSpecialization;
	String doctorAvailability;
	String patientName;
	String patientId;
	String patientMobNumber;
	int age;
	String date;
	static ArrayList<Doctors> list = new ArrayList<Doctors>();
	static ArrayList<Patient> patientList = new ArrayList<Patient>();
	static ArrayList<Appoitment> appoitmentList = new ArrayList<Appoitment>();

	Doctors doctors = new Doctors();

	ObjectMapper mapper = new ObjectMapper();

	public void operationClinic() {
		System.out.println("***WELCOME***");
		System.out
				.println("\n 1. Add Doctor \n2. Add Patient \n3. Search Doctor \n4. Search Patient \n5. Take Appoitment"
						+ "\n6. Show Patient List \n7. Show Doctors List \n8. Show Appoitment List \n9. Show Best Doctor");
		System.out.println("enter your choice");
		int choice = Utility.inputInteger();
		switch (choice) {
		case 1:
			addDoctor();
			break;
		case 2:
			addPatient();
			break;
		case 3:
			searchDoctor();
			break;
		case 4:
			searchPatient();
			break;
		case 5:
			appoitment();
			break;
		case 6:
			showPatientList();
			break;
		case 7:
			showDoctorList();
			break;
		case 8:
			appoitmentList();
			break;
		case 9:
			showBestDoctor();
			break;
		default:
			System.out.println("choose correct option");

		}
	}

	

	public void addDoctor(ArrayList<Doctors>doctor) {
		
		File file=new File("doctors.json");
		list=new ArrayList(Arrays.asList(mapper));
		
		System.out.println("Enter the Doctor Name");
		String firstName = Utility.inputString1();
		doctors.setName(firstName);

		System.out.println("Enter Doctor ID");
		String id = Utility.inputString();
		doctors.setId(id);
		System.out.println("Enter Doctor Specialization ");
		String specialization = Utility.inputString();
		doctors.setSpecialization(specialization);
		System.out.println("Enter Doctor Available Time");
		String time = Utility.inputString();
		doctors.setAvailability(time);

	}

	public void addPatientDetails() {
		System.out.println("Enter the patient name");
		String name = Utility.inputString();
		System.out.println("enter the Patient ID");
		String id = Utility.inputString();
		System.out.println("Enter the Mobile Number");
		String mobinumber = Utility.inputString();

	}
}
