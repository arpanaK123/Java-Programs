package Com.bridgeit.ClinicUtility;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.bridgeit.ClinicManagementPozo.Appointment;
import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

public class Utility {
	Scanner scan = new Scanner(System.in);

	/**
	 * Take a integer type input from a scanner class
	 * 
	 * @return integer input
	 */
	public int inputInteger() {
		int input = scan.nextInt();
		return input;
	}

	/**
	 * Take a String type input from a Scanner class
	 * 
	 * @return String input
	 */
	public String inputSring() {
		String input = scan.next();
		return input;
	}

	/**
	 * Funtion to Add the Doctor Details inside the file
	 * 
	 * @return the details of Doctor
	 */
	public static Doctor addDoctorIntoList() {
		Doctor doctor = new Doctor();
		Utility utility = new Utility();
		System.out.println("\t-> Enter Doctor Name");
		String doctorName = utility.inputSring();
		doctor.setDoctorName(doctorName);
		System.out.println("\t-> Enter Doctor ID");
		int id = utility.inputInteger();
		doctor.setDoctorId(id);
		System.out.println("\t-> Enter Doctor Specialization");
		String doctorSpecialization = utility.inputSring();
		doctor.setDoctorSpecialization(doctorSpecialization);
		System.out.println("\t-> Enter Doctor Availability \n\t AM \n\t PM \n\t Both");
		String doctorAvailable = utility.inputSring();
		doctor.setDoctorAvailability(doctorAvailable);
		doctor.setNumberOfPatient(0);
		return doctor;

	}

	/**
	 * Function to add the Details of Patient inside the file
	 * 
	 * @return the details of Patient
	 */
	public static Patient addPatientIntoList() {
		Utility utility = new Utility();
		Patient patient = new Patient();
		System.out.println("Enter Patient Name");
		String patientName = utility.inputSring();
		patient.setPatientName(patientName);
		System.out.println("Enter Patient ID");
		int patientId = utility.inputInteger();

		patient.setPatientId(patientId);
		System.out.println("Enter Patient Age");
		int patientAge = utility.inputInteger();
		patient.setPatientAge(patientAge);
		System.out.println("Enter Patient Mobile Number");
		String patientNumber = utility.inputSring();
		patient.setPatientMobNum(patientNumber);
		return patient;
	}

	/**
	 * Funtion to Add the Appointment Details inside the file
	 * 
	 * @param doctorList:Details
	 *            of doctor
	 * @param patientList:Details
	 *            of Patient
	 * @return:Details of Appointment
	 */
	public static Appointment addAppointmentIntoList(List<Doctor> doctorList, List<Patient> patientList) {
		Utility utility = new Utility();

		Appointment appointment = new Appointment();
		System.out.println("Enter Name Of the Patient");
		String patientname = utility.inputSring();
		int count = 0;
		for (Patient patient : patientList) {
			if (patient.getPatientName().equals(patientname)) {
				count++;
				System.out.println("Enter Doctor Name");
				String doctorName = utility.inputSring();
				System.out.println("enter Doctor id");
				int doctorid = utility.inputInteger();
				Date date = new Date();
				String date1 = date.toString();
				for (Doctor doctor : doctorList) {
					if (doctor.getDoctorName().equals(doctorName)) {
						if (doctor.getDoctorId() == doctorid) {
							if (doctor.getNumberOfPatient() < 5) {
								appointment.setDoctor(doctor);
								appointment.setPatient(patient);
								appointment.setDate(date1);
								doctor.setNumberOfPatient(doctor.getNumberOfPatient() + 1);
								System.out.println("Appontmnet fixed on: " + date1);
								return appointment;

							} else {
								System.out.println(
										"Take appointment other day ...\nBecause Doctor has maximum Number of Patient");
							}
						}
					}
				}
			}
		}
		if (count == 0) {
			System.out.println("you are not the Patient of this Clinic...");
			System.exit(0);
		}
		return null;

	}

}
