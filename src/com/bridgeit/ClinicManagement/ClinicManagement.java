package com.bridgeit.ClinicManagement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

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

	static ArrayList<Doctors> doctorList = new ArrayList<Doctors>();
	static ArrayList<Patient> patientList = new ArrayList<Patient>();
	static ArrayList<Appointment> appointmentList = new ArrayList<Appointment>();

	static Doctors doctors = new Doctors();
	static Patient patient = new Patient();

	static ObjectMapper mapper = new ObjectMapper();

	public void operationClinic() throws IOException {
		boolean flag = true;
		do {
			System.out.println("\t*WELCOME*");
			System.out.println(
					"\n1. Add Doctor \n2. Add Patient \n3. Search Doctor \n4. Search Patient \n5. Take Appoitment"
							+ "\n6. Show Patient List \n7. Show Doctors List \n8. Show Appointment List \n9. Show Best Doctor \n10 Exit");
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
				searchDoctor(doctorList);
				break;
			case 4:
				searchPatient(patientList);
				break;
			case 5:
				takeAppointment();
				break;
			case 6:
				showPatientList(patientList);
				break;
			case 7:
				showDoctorList(doctorList);
				break;
			case 8:
				appointmentList();
				break;
			case 9:
				showBestDoctor();
				break;
			case 10:
				flag = false;
				System.out.println("System closed");
				break;
			default:
				flag = false;
				System.out.println("wrong option");

				break;
			}

		} while (flag);
	}

	public void showDoctorList(ArrayList<Doctors> doctors) throws IOException, JsonMappingException, IOException {

		File file = new File("doctors.json");
		doctorList = new ArrayList(Arrays.asList(mapper.readValue(file, Doctors[].class)));
		System.out.println(doctorList);

	}

	public void showPatientList(ArrayList<Patient> patients)
			throws JsonParseException, JsonMappingException, IOException {
		File file = new File("patient.json");

		patientList = new ArrayList(Arrays.asList(mapper.readValue(file, Patient[].class)));
		System.out.println(patientList);
	}

	public void searchPatient(ArrayList<Patient> patients) {
		System.out.println("\n1. Patient Name \n2. Patient ID\n 3. Patient Mobile Number");
		System.out.println("enter your choice");
		int choice = Utility.inputInteger();
		switch (choice) {
		case 1:
			System.out.println("Enter patient name to search");
			String searchName = Utility.inputString();
			this.searchName(patients, searchName);
			break;
		case 2:
			System.out.println("Enter patient ID");
			String searchId = Utility.inputString();
			this.searchId(patients, searchId);
			break;
		case 3:
			System.out.println("Enter Patient Mobile Number");
			String searchMobNumber = Utility.inputString();
			this.searchMobNumber(patients, searchMobNumber);
			break;
		default:
			System.out.println("Please choose correct option");
		}

	}

	public void patientPrint(Patient patients) {
		System.out.println("Patients Details are: ");
		System.out.println("Patient Name: " + patients.name);
		System.out.println("Patient Id: " + patients.id);
		System.out.println("Patient Mobi. num: " + patients.mobileNumber);
	}

	public void searchName(ArrayList<Patient> patients, String name) {
		int count = 0;
		for (Patient patient : patients) {
			if (name.equals(patient.name)) {
				this.patientPrint(patient);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Patient for given name not found");
		}
	}

	public void searchId(ArrayList<Patient> patients, String id) {
		int count = 0;
		for (Patient patient : patients) {
			if (id == patient.id) {
				this.patientId = id;
				count++;

			}
		}
		if (count == 0)
			;
		{
			System.out.println("patient for given id not found");
		}
	}

	public void searchMobNumber(ArrayList<Patient> patients, String number) {
		int count = 0;
		for (Patient patient : patients) {
			if (number.endsWith(patient.mobileNumber)) {
				this.patientPrint(patient);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("patient for given number not found");
		}
	}

	public void searchDoctor(ArrayList doctors) {
		System.out.println("\n1. Doctor Name \n2. Doctor ID \n3. Doctor Specialization \n4. Doctor Availability");
		System.out.println("User enter your choice");
		int choice = Utility.inputInteger();
		switch (choice) {
		case 1:
			System.out.println("Plz Enter Doctor Name for search");
			String nameSearch = Utility.inputString();
			this.searchDoctorName(doctors, nameSearch);
			break;
		case 2:
			System.out.println("Plz Enter Doctor ID for search");
			String searchid = Utility.inputString();
			this.searchDoctorId(doctors, searchid);
			break;
		case 3:
			System.out.println("Plz enter Doctor Specialization");
			String doctorSpecialization = Utility.inputString();
			this.searchDoctorSpecialization(doctors, doctorSpecialization);
			break;
		case 4:
			System.out.println("Plz enter Morning or Evening");
			String available = Utility.inputString();
			this.doctorAvailable(doctors, available);
			break;
		default:
			System.out.println("enter correct option");
			break;
		}
	}

	public void printDoctor(Doctors doctor) {
		System.out.println("Doctor Name: " + doctor.name);
		System.out.println("Doctor ID: " + doctor.id);
		System.out.println("Doctor Specialization: " + doctor.specialization);
		System.out.println("Doctor Available: " + doctor.availability);
	}

	public void searchDoctorName(ArrayList<Doctors> doctors, String name) {
		int count = 0;
		for (Doctors doctor : doctors) {
			if (name.equals(doctor.name)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor for given name not found");
		}
	}

	public void searchDoctorId(ArrayList<Doctors> doctors, String id) {
		int count = 0;
		for (Doctors doctor : doctors) {
			if (id == doctor.id) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor for given ID not found");
		}
	}

	public void searchDoctorSpecialization(ArrayList<Doctors> doctors, String specialization) {
		int count = 0;
		for (Doctors doctor : doctors) {
			if (specialization.equals(doctor.specialization)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor for given specialization not found");
		}
	}

	public void doctorAvailable(ArrayList<Doctors> doctors, String available) {
		int count = 0;
		for (Doctors doctor : doctors) {
			if (available.equals(doctor.availability)) {
				this.printDoctor(doctor);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Doctor for given availability not found");
		}
	}

	static Patient addPatient() {
		try {
			File file = new File("patient.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayjsonFile;
			if ((arrayjsonFile = reader.readLine()) != null) {

				TypeReference<ArrayList<Patient>> type = new TypeReference<ArrayList<Patient>>() {
				};
				patientList = mapper.readValue(arrayjsonFile, type);
			}
			reader.close();
			System.out.println("Enter Patient Name");
			String patientName = Utility.inputString();
			patient.setName(patientName);
			System.out.println("Enter Patient ID");
			String patientID = Utility.inputString();
			patient.setId(patientID);
			System.out.println("Enter Patient Mobile Number");
			String patientMob = Utility.inputString();
			patient.setMobileNumber(patientMob);

			System.out.println("Enter Patient Age");
			int age = Utility.inputInteger();
			patient.setAge(age);

			patientList.add(patient);
			System.out.println(patientList);

			mapper.writeValue(file, patientList);
			System.out.println("Successfull added Patient Information");
			System.out.println("\nThere are" + patientList.size() + " people in the Clinic Management\n");
		} catch (Exception e) {
			e.printStackTrace();
		}
		save("patient", patientList);
		return patient;
	}

	static void addDoctor() throws IOException {
		File file = new File("doctors.json");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String arrayDoctorFile;
		if ((arrayDoctorFile = reader.readLine()) != null) {
			TypeReference<ArrayList<Doctors>> type = new TypeReference<ArrayList<Doctors>>() {
			};
			doctorList = mapper.readValue(arrayDoctorFile, type);
		}
		reader.close();
		System.out.println("Enter Doctor Name");
		String docName = Utility.inputString();
		doctors.setName(docName);
		System.out.println("Enter doctor ID");
		String docId = Utility.inputString();
		doctors.setId(docId);
		System.out.println("Enter Doctor Specialization");
		String docSpecial = Utility.inputString();
		doctors.setSpecialization(docSpecial);
		System.out.println("Enter Doctor availabel Time \n1. AM  \n2. PM \n3. Both");

		String docAvail = Utility.inputString();
		doctors.setAvailability(docAvail);

		System.out.println("Enter Date");
		String date = Utility.inputString();

		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date date2 = null;
		String formatdate = null;
		try {
			date2 = format.parse(date);

			formatdate = format.format(date2);
			System.out.println(formatdate);
			doctors.setDate(formatdate);
			doctorList.add(doctors);

			System.out.println(doctorList);
			System.out.println("Successuflly added ");
			System.out.println("\nThere are: " + doctorList.size() + " people in the Clinic Management");
		} catch (Exception e) {
			e.printStackTrace();
		}
		save("doctors", doctorList);
	}

	public void takeAppointment() {
		Appointment appointment = new Appointment();
		File file = new File("appointment.json");
		try {
			BufferedReader reader = new BufferedReader(new FileReader("appointment.json"));
			String arrayAppointFile;
			if ((arrayAppointFile = reader.readLine()) != null) {
				TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {
				};
				appointmentList = mapper.readValue(arrayAppointFile, type);
			}

			System.out.println("Enter Doctor Name to take appointment");
			String docName = Utility.inputString();
			System.out.println("enter appointment date");
			String date = Utility.inputString();
			appointment.setDate(date);
			File file1 = new File("appointment.json");
			BufferedReader reader1 = new BufferedReader(new FileReader("appointment.json"));
			String arrayappointmentFIle;
			if ((arrayAppointFile = reader1.readLine()) != null) {
				TypeReference<ArrayList<Doctors>> type = new TypeReference<ArrayList<Doctors>>() {
				};
				appointmentList = mapper.readValue(arrayAppointFile, type);

			//	doctorList = mapper.readValue(arrayAppointFile, type);

			}
			for (int i = 0; i < doctorList.size(); i++) {
				doctors = doctorList.get(i);
				if (docName.equals(doctors.getName()) && date.equals(doctors.getDate())) {
					if ((doctors.getNumOfAppointment() == 0)) {
						patient = addPatient();
						doctors.setNumOfAppointment(1);
						mapper.writeValue(file, doctorList);
						appointment.setDoctorName(docName);
						appointment.setDate(date);
						appointment.setPatient(patient);
						;
						patientList.add(patient);
						mapper.writeValue(file, patientList);
					} else if (doctors.getNumOfAppointment() > 0 && doctors.getNumOfAppointment() < 5) {
						patient = addPatient();
						doctors.setNumOfAppointment(doctors.getNumOfAppointment());
						mapper.writeValue(file, doctorList);
						appointment.setPatient(patient);
						appointment.setDate(date);
						patientList.add(patient);
						mapper.writeValue(file, patientList);
					} else {
						System.out.println("Doctor Name: " + docName + " not valid");
						System.out.println("Fix appointment next day");
						SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
						Calendar calendar = Calendar.getInstance();
						try {
							calendar.setTime(sdf.parse(date));
						} catch (ParseException e) {
							e.printStackTrace();
						}
						calendar.add(calendar.DAY_OF_MONTH, 1);
						String newDate = sdf.format(calendar.getTime());
						System.out.println("date increment by one " + newDate);
						patient = addPatient();
						doctors.setNumOfAppointment(doctors.getNumOfAppointment() + 1);
						mapper.writeValue(file, doctorList);
						appointment.setPatient(patient);
						appointment.setDate(newDate);
						patientList.add(patient);
						mapper.writeValue(file, patientList);

					}

				}
			}

			save("appointment",appointmentList);
			System.out.println("your appointment fixed ");
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void showBestDoctor()

	{
		try {
			File file = new File("doctors.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayBestDoctorFile;
			if ((arrayBestDoctorFile = reader.readLine()) != null) {
				TypeReference<ArrayList<Doctors>> type = new TypeReference<ArrayList<Doctors>>() {
				};

				doctorList = mapper.readValue(arrayBestDoctorFile, type);
			}
			System.out.println("Popular Doctors are: ");
			Iterator<Doctors> iterator = doctorList.iterator();
			while (iterator.hasNext()) {
				doctors = iterator.next();
				if (doctors.getNumberofPatient() == 5
						|| doctors.getNumberofPatient() < 5 && doctors.getNumberofPatient() > 0) {
					System.out.println(doctors);
					String bestDoctor = doctors.getSpecialization();
					System.out.println("Best Specialization in the clinic: " + bestDoctor);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void appointmentList() {
		Appointment appointment = new Appointment();
		try {
			File file = new File("appointment.json");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String arrayAppointmentList;
			if ((arrayAppointmentList = reader.readLine()) != null) {
				TypeReference<ArrayList<Appointment>> type = new TypeReference<ArrayList<Appointment>>() {
				};
				appointmentList = mapper.readValue(arrayAppointmentList, type);

			}
			for (Appointment appointment2 : appointmentList) {
				System.out.println(appointment2.toString());
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static <T> void save(String file, List<T> list) {
		try {
			mapper.writeValue(new File("clinic/" + file + ".json"), list);
			System.out.println("\n\tData saved");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
