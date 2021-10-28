package com.Xworkz.hospitallapp.hospital;

import com.Xworkz.hospitallapp.dto.PatientDTO;

public class Hospitall {
	

	public class Hospital extends PatientDTO
	{
		public PatientDTO[] patients;
		private int index;
		public static int s=0;
		
		public Hospital(int size)
		{
			patients = new PatientDTO[size];
		}
		
		public boolean createPatient(PatientDTO patients)
		{
			boolean patientAdded = false;
			System.out.println("Inside create patient");
				if(patients != null)
				{
					this.patients[index++] = patients;
					patientAdded = true;
				}
				else
				{
					System.out.println("No Patient added");
					return patientAdded = false;
				}
			return patientAdded;
		}
		
		public void getAllPatients()
		{
			for(int i=0; i<patients.length-s; i++)
			{
				System.out.println(patients[i]);
			}
		}
		
		public PatientDTO getPatientByName(String patientName)
		{
			boolean f=false;
			PatientDTO patientDTO = null;
			System.out.println("Inside Get patient by name method");
			if(patientName != null)
			{
				for(int i=0; i<patients.length; i++)
				{
					if(patients[i].getPatientName().equals(patientName))
					{
						System.out.println("Patient found by Name : "+patientName);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}	
			}
			if(f==false)
			{
				System.out.println("Patient not found");
			}
			return patientDTO;
		}
		
		public PatientDTO getPatientById(int patientId)
		{
			boolean f=false;
			PatientDTO patientDTO = null;
			System.out.println("Inside Get patient by id method");
			if(patientId != 0)
			{
				for(int i=0; i<patients.length; i++)
				{
					if(patients[i].getPatientId()==(patientId))
					{
						System.out.println("Patient found by ID : "+patientId);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}	
			}
			if(f==false)
			{
				System.out.println("Patient not found");
			}
			return patientDTO;
		}
		
		public PatientDTO getPatientByAge(int age)
		{
			boolean f=false;
			PatientDTO patientDTO=null;
			System.out.println("Inside get patient by age method");
			if(age != 0)
			{
				for(int i =0;i<patients.length;i++)
				{
					if(patients[i].getAge()==(age))
					{
						System.out.println("Patient found by age : "+age);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}
			}
			if(f==false)
			{
				System.out.println("Patient not found");
			}
			return patientDTO;
		}
		
		public boolean getPatientByStreetName(String streetName) {
			boolean f=false;
			PatientDTO patientDTO = null;
			System.out.println("Inside get patient by street name");
			if(streetName != null) {
				for(int i=0; i<patients.length; i++) {
					if(patients[i].getAddress().getCountry().getStates().getDistricts().getAreaDTO().getStreetDTO().getStreetName().equals(streetName)) {
						System.out.println("Patient founded by street name : "+streetName);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else {
						f=false;
					}
				}
			}
			if(f==false) {
				System.out.println("Street name not founded");
			}
			return f;
		}
		
		public boolean getPatientByState(String stateName) {
			boolean f=false;
			PatientDTO patientDTO = null;
			System.out.println("Inside get patient by state name");
			if(stateName != null) {
				for(int i=0; i<patients.length; i++) {
					if(patients[i].getAddress().getCountry().getStates().getStateName().equals(stateName)) {
						System.out.println("Patient founded by street name : "+stateName);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else {
						f=false;
					}
				}
			}
			if(f==false) {
				System.out.println("State name not founded");
			}
			return f;
		}
		
		public boolean getPatientByArea(String area) {
			boolean f=false;
			PatientDTO patientDTO = null;
			System.out.println("Inside get patient by Area name");
			if(area != null) {
				for(int i=0; i<patients.length; i++) {
					if(patients[i].getAddress().getCountry().getStates().getDistricts().getAreaDTO().getAreaName().equals(area)) {
						System.out.println("Patient founded by street name : "+area);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else {
						f=false;
					}
				}
			}
			if(f==false) {
				System.out.println("area name not founded");
			}
			return f;
		}
		
		public boolean getPatientByStreetNo(int streetNo) {
			boolean f=false;
			PatientDTO patientDTO = null;
			System.out.println("Inside get patient by street No");
			if(streetNo != 0) {
				for(int i=0; i<patients.length; i++) {
					if(patients[i].getAddress().getCountry().getStates().getDistricts().getAreaDTO().getStreetDTO().getStreetNo()==(streetNo)) {
						System.out.println("Patient founded by street no : "+streetNo);
						patientDTO = patients[i];
						f=true;
						break;
					}
					else {
						f=false;
					}
				}
			}
			if(f==false) {
				System.out.println("Street no not founded");
			}
			return f;
		}
		
		public boolean updatePatientContactNoById(int patientId, long contactNo)
		{
			boolean f=false;
			PatientDTO patientDTO=null;
			System.out.println("Inside update patient contact");
			if(patientId > 0 && contactNo > 0)
			{
				for(int i =0;i<patients.length;i++)
				{
					if(patients[i].getPatientId()==(patientId))
					{
						System.out.println("Patient contact number updated by : "+contactNo);
						patients[i].setContactNo(contactNo);
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}
			}
			if(f==false)
			{
				System.out.println("Patient contact number not updated");
			}
			return f;
		}
		
		public boolean deletePatientById(int id)
		{
			boolean f=false;
			int y=0;
			PatientDTO patientDTO=null;
			System.out.println("Inside delete patient method");
			if(id > 0)
			{
				for(int i=0; i<patients.length; i++)
				{
					if(patients[i].getPatientId()==(id))
					{
						System.out.println("Patient deleted by id : "+id);
						y=i;
						s=s+1;
						f=true;
						break;
					}
					else
					{
						f=false;
					}
				}
				if(y!=-1)
				{
					for(int i=y;i<patients.length-1;i++)
					{
						patients[i]=patients[i+1];
					}
				}
			}
			if(f==false)
			{
				System.out.println("Patient is not deleted");
			}
			
			return f;
		}
	}
}