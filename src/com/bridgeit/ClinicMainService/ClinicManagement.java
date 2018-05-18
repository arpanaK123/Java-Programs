/*
 * Purpose:-This programme is used to manage a list of Doctors associated with the Clinique. 
 *          This also manages the list of patients who use the clinique.
 *          
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:- 18 May, 2018
 */
package com.bridgeit.ClinicMainService;

import java.util.ArrayList;
import java.util.List;

import com.bridgeit.ClinicController.AddDetails;
import com.bridgeit.ClinicController.AddDetailsImplement;
import com.bridgeit.ClinicController.DisplayDetailsImplement;
import com.bridgeit.ClinicController.SearchDetailsImplement;
import com.bridgeit.ClinicManagementPozo.Appointment;
import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

import Com.bridgeit.ClinicUtility.Utility;

public class ClinicManagement {

	public static List<Doctor> doctorList = new ArrayList<>();
	public static List<Patient> patientList = new ArrayList<>();
	public static List<Appointment> appointmentList = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("\t\t***************************");
		System.out.println("\t\t +Welcome To Parse Clinic+");
		System.out.println("\t\t***************************");
		System.out.println();

		AddDetailsImplement addDetailsImplement = new AddDetailsImplement();
		DisplayDetailsImplement displayDetailsImplement = new DisplayDetailsImplement();
		SearchDetailsImplement searchDetailsImplement = new SearchDetailsImplement();

		doctorList = addDetailsImplement.read(doctorList, "doctor", "Doctor");
		patientList = addDetailsImplement.read(patientList, "patient", "Patient");
		appointmentList = addDetailsImplement.read(appointmentList, "appointment", "Appointment");

		Utility utility = new Utility();
		int serviceLoop = 0;
		while (serviceLoop == 0) {
			System.out.println("\t1.Add new Data \n\t2.Take Appointment \n\t3.Save Data "
					+ "\n\t4.Display Details \n\t5.Search Details \n\t6.Close Service");
			System.out.println();
			System.out.println("User Enter Your Choice");
			int choice = utility.inputInteger();
			switch (choice) {
			case 1:
				int addLoop = 0;
				while (addLoop == 0) {
					System.out.println("\n\t1. Add Doctor\n\t2. Add Patient \n\t3. Exit");
					System.out.println();
					System.out.println("User Enter Your Choice");
					int addChoice = utility.inputInteger();

					switch (addChoice) {
					case 1:
						System.out.println("Enter Doctor Details\n");
						doctorList = addDetailsImplement.addDoctor(doctorList);
						break;
					case 2:
						patientList = addDetailsImplement.addPatient(patientList);
						break;
					case 3:
						addLoop = 1;
						System.out.println("Something Wrong.......");
						break;
					default:
						addLoop = 1;
						System.out.println("Something Wrong......");
						break;
					}
				}
				break;
			case 2:
				appointmentList = addDetailsImplement.appointment(appointmentList, doctorList, patientList);
				break;
			case 3:
				int saveLoop = 0;
				while (saveLoop == 0) {
					System.out.println("\n\t1.Save Doctor Details \n\t2.Save Patient List "
							+ "\n\t3.Save Appointment List \n\t4.Exit");
					System.out.println("User enter your choice");
					int choiceSave = utility.inputInteger();
					switch (choiceSave) {
					case 1:
						addDetailsImplement.save(doctorList, "doctor");
						break;
					case 2:
						addDetailsImplement.save(patientList, "patient");
						break;
					case 3:
						addDetailsImplement.save(appointmentList, "appointment");
						break;
					case 4:
						saveLoop = 1;
						System.out.println("Service closed");
						break;
					default:

					}
				}
				break;
			case 4:
				int displayLoop = 0;
				while (displayLoop == 0) {
					System.out.println("\n\t1. Display Doctor \n\t2. Display Patient \n\t3. Display Appointment "
							+ "\n\t4. Display Popular Doctor \n\t5. Display Popular Specialization \n\t6. Exit");
					System.out.println("User Enter Your Choice");
					int displayChoice = utility.inputInteger();
					switch (displayChoice) {
					case 1:
						displayDetailsImplement.displayDoctorList(doctorList);
						break;
					case 2:
						displayDetailsImplement.displayPatientList(patientList);
						break;
					case 3:
						displayDetailsImplement.displayAppointmentList(appointmentList);
						break;
					case 4:
						displayDetailsImplement.dispalyPopularDoctor(doctorList);
						break;
					case 5:
						displayDetailsImplement.dispalyPopularSpecialization(doctorList);
						break;
					case 6:
						displayLoop = 1;
						System.out.println("Service Closed");
						break;
					default:
						System.out.println("Something Wrong............");
					}
				}
				break;
			case 5:
				int searchLoop = 0;
				while (searchLoop == 0) {
					System.out.println("\n\t1. Search Doctor \n\t2. Search Patient \n\t3. Exit");
					System.out.println("User Enter Your Choice");
					int searchChoice = utility.inputInteger();
					switch (searchChoice) {

					case 1:
						int searchLoopDoctor = 0;
						while (searchLoopDoctor == 0) {
							System.out.println(
									"\n\t1. Search Doctor By Name \n\t2. Search Doctor By ID \n\t3. Search Doctor By Specialization"
											+ "\n\t4. Search Doctor By Availability \n\t5. Exit");
							System.out.println("User Enter Your Choice");
							int choiceSearchDoctor = utility.inputInteger();
							switch (choiceSearchDoctor) {
							case 1:
								searchDetailsImplement.searchDoctorByName(doctorList);
								break;
							case 2:
								searchDetailsImplement.searchDoctorByID(doctorList);
								break;
							case 3:
								searchDetailsImplement.searchDoctorBySpecialization(doctorList);
								break;
							case 4:
								searchDetailsImplement.searchDoctorByAvailability(doctorList);
								break;
							case 5:
								searchLoopDoctor = 1;
								System.out.println("Service Closed");
								break;
							default:
								System.out.println("Something Wrong");

							}
						}
						break;
					case 2:
						int searchLoopPatient = 0;
						while (searchLoopPatient == 0) {
							System.out.println("\n\t1. Search Patient By Name \n\t2. Search Patient By ID\n\t3. Search "
									+ "Patient By Mobile Number \n\t4. Exit");
							System.out.println("User Enter Your Choice");
							int searchPatient = utility.inputInteger();
							switch (searchPatient) {
							case 1:
								searchDetailsImplement.searchPatientByName(patientList);
								break;
							case 2:
								searchDetailsImplement.searchPatientByID(patientList);
								break;
							case 3:
								searchDetailsImplement.searchPatientByMobileNumber(patientList);
								break;
							case 4:
								searchLoopPatient = 1;
								System.out.println("Service Closed");
							default:
								System.out.println("Something Wrong..........");
							}
						}
						break;
					case 3:
						searchLoop = 1;
						System.out.println("Search Service Closed");
						break;
					default:
						System.out.println("Something Wrong............");
						break;

					}
				}
				break;
			case 6:
				serviceLoop = 1;
				System.out.println("Clinic Service closed");
				break;
			default:
				System.out.println("Something Wrong.............");

			}
		}
	}
}
