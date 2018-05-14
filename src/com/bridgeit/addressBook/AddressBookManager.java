package com.bridgeit.addressBook;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgeit.utility.Utility;

public class AddressBookManager {
	ObjectMapper mapper = new ObjectMapper();
Scanner scan=new Scanner(System.in);
public void create()
{
File file=new File("/home/bridgeit/Documents/workspace-sts-3.9.3.RELEASE/Java-Program/"+Utility.inputString()+".json");

try
{
		if (file.createNewFile()) {
			System.out.println("Welcome...Your File is Created");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("{}");
			System.out.println("Enter Your Address Book Name");
			String name = Utility.inputString();
			fileWriter.close();

		} else {
			System.out.println("Your file is already created");
	
		}
}
catch(Exception e)
{
	e.printStackTrace();
	
}
}

public void open() throws IOException
{
	File file1=new File("/home/bridgeit/Documents/workspace-sts-3.9.3.RELEASE/Java-Program");
	File []array=file1.listFiles();
	for(File file:array)
	{
		System.out.println(file);
	}
	String folderPath="/home/bridgeit/Documents/workspace-sts-3.9.3.RELEASE/Java-Program";
	System.out.println("enter the file name");
	String fileName=Utility.inputString();
	folderPath.concat("/").concat("fileName");

	if(!Desktop.isDesktopSupported())
	{
		System.out.println("desktop is not supported");
	}
	Desktop desktop=Desktop.getDesktop();
	if(file1.exists())
	{
		desktop.open(file1);
	}
}
AddressBook manage= new AddressBook();
public void save()
{
	ArrayList<Person> list=new ArrayList<Person>();
	list=manage.list();
	
	try
	{
		mapper.writeValue("file1", list);

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}

public void addPerson()
{
	System.out.println("Enter your First Name");
	String firstName=Utility.inputString();
	System.out.println("enter your last name");
	String lastName=Utility.inputString();
	System.out.println("enter your Mobile number");
	String mobNumber=Utility.inputString();
	System.out.println("enter your state");
	String state=Utility.inputString();
	System.out.println("enter your city");
	String city=Utility.inputString();
	System.out.println("enter your zip");
	String zip=Utility.inputString();
	
}


}
