package com.bridgeit.ClinicController;

import java.util.List;

import com.bridgeit.ClinicManagementPozo.Appointment;
import com.bridgeit.ClinicManagementPozo.Doctor;
import com.bridgeit.ClinicManagementPozo.Patient;

public interface AddDetails {
	List<Doctor> addDoctor(List<Doctor> doctorList);

	List<Patient> addPatient(List<Patient> patientList);

	List<Appointment> appointment(List<Appointment> appointmentList, List<Doctor> doctorList,
			List<Patient> patientList);

	<T> void save(List<T> T, String file);

	<T> List<T> read(List<T> T, String file, String Pozo);
}
