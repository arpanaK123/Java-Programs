package com.bridgeit.ClinicController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.bridgeit.ClinicManagementPozo.Appointment;
import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

import Com.bridgeit.ClinicUtility.Utility;

public class AddDetailsImplement implements AddDetails {

	ObjectMapper mapper = new ObjectMapper();

	// Add doctor details in the List
	@Override
	public List<Doctor> addDoctor(List<Doctor> doctorList) {
		doctorList.add(Utility.addDoctorIntoList());
		return doctorList;
	}

	// Add Patient Details in the List
	@Override
	public List<Patient> addPatient(List<Patient> patientList) {
		patientList.add(Utility.addPatientIntoList());
		return patientList;
	}

	// Add Appointment Details Un the List
	@Override
	public List<Appointment> appointment(List<Appointment> appointmentList, List<Doctor> doctorList,
			List<Patient> patientList) {
		appointmentList.add(Utility.addAppointmentIntoList(doctorList, patientList));

		return appointmentList;
	}

	// Save the Details inside File
	@Override
	public <T> void save(List<T> T, String file) {
		try {
			mapper.writeValue(new File("Clinic/" + file + ".json"), T);
			System.out.println("File Saved");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Read the Details from File

	@Override
	public <T> List<T> read(List<T> T, String file, String Pozo) {

		ObjectMapper objectmapper = new ObjectMapper();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader("Clinic/" + file + ".json"));
			String arrayJsonRead;
			if ((arrayJsonRead = bufferedReader.readLine()) != null) {
				if (Pozo.equals("Doctor")) {
					TypeReference<ArrayList<Doctor>> typereference = new TypeReference<ArrayList<Doctor>>() {
					};
					T = objectmapper.readValue(arrayJsonRead, typereference);
				} else if (Pozo.equals("Patient")) {
					TypeReference<ArrayList<Patient>> typereference = new TypeReference<ArrayList<Patient>>() {
					};
					T = objectmapper.readValue(arrayJsonRead, typereference);
				} else if (Pozo.equals("Appointment")) {
					TypeReference<ArrayList<Appointment>> typereference = new TypeReference<ArrayList<Appointment>>() {
					};
					T = objectmapper.readValue(arrayJsonRead, typereference);
				}
				bufferedReader.close();

			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
		return T;
	}

}
