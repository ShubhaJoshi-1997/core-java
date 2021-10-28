package com.Xworkz.hospitallapp.dto;

public class PatientDTO {

	
		public PatientDTO()
		{
		System.out.println("\n"+this.getClass().getSimpleName()+" Object is created");
		}
		
			private int patientId;
			private String patientName;
			private long contactNo;
			private AddressDTO address;
			private String bloodGroup; 
			private int age;
			private String gender;
			
		
		public int getPatientId()
		{
			return patientId;
		}
		public void setPatientId(int patientId)
		{
			this.patientId = patientId;
		}
		
		public String getPatientName()
		{
			return patientName;
		}
		public void setPatientName(String patientName)
		{
			this.patientName = patientName;
		}
		
		public long getContactNo()
		{
			return contactNo;
		}
		public void setContactNo(long contactNo)
		{
			this.contactNo = contactNo;
		}
		
		public String getBloodGroup()
		{
			return bloodGroup;
		}
		public void setBloodGroup(String bloodGroup)
		{
			this.bloodGroup = bloodGroup;
		}
		
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public String getGender()
		{
			return gender;
		}
		public void setGender(String gender)
		{
			this.gender = gender;
		}
		
		public AddressDTO getAddress()
		{
			return address;
		}
		public void setAddress(AddressDTO address)
		{
			this.address = address;
		}
		
		@Override
		public String toString()
		{
			return "\npatientDTO-{Patient Id = "+this.patientId+",\nPatient Name = "+this.patientName+",\nContactNo = "+this.contactNo+",\nBloodGroup = "+this.bloodGroup+",\nAge = "+this.age+",\nGender = "+this.gender+",\nAddress = "+this.address+"}";
		}
	}