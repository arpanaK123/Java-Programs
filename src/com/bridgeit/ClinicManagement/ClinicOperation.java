/*
 * Purpose:- the user can take appointment for patient at different date or availability time.
 *           Print the Doctor Patient Report. Also show which Specialization is popular in the 
 *           Clinique as well as which Doctor is popular.
 *           
 *@Author:-Arpana Kumari
 *Version:-1.0
 *@Since:-15 May, 2018
 */
package com.bridgeit.ClinicManagement;

import java.io.IOException;

public class ClinicOperation {

	public static void main(String[] args) throws IOException {
		System.out.println("\t\t**********CLINIC MANAGEMENT************");
		ClinicManagement clinic = new ClinicManagement();
		clinic.operationClinic();
	}

}
