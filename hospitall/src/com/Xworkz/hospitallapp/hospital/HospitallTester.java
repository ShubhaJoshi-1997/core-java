
package com.Xworkz.hospitallapp.hospital;
import com.Xworkz.hospitallapp.dto.PatientDTO;
import java.util.*;

public class HospitallTester {
	

	class HospitalTester
	{
		
		public static void main(String args[])
		{
			System.out.println(" CITY hospital");
			System.out.println("\n"+"Enter the number of patients");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			Hospitall hospitall = new Hospitall(size);
			if(size>0)
			{	
				for(int i = 0; i< size; i++)
				{
				PatientDTO dto = new PatientDTO();
				System.out.println("Enter the patient details");
				
				System.out.println("Enter the patient ID");
				int patientId = sc.nextInt();
				dto.setPatientId(patientId);
				
				System.out.println("Enter the Patient name");
				String patientName = sc.next();
				dto.setPatientName(patientName);
				
				System.out.println("Enter the contact number");
				long contactNo = sc.nextLong();
				dto.setContactNo(contactNo);
				
				System.out.println("Enter the Bloodgroup");
				String bloodGroup = sc.next();
				dto.setBloodGroup(bloodGroup);
				
				System.out.println("Enter the Age");
				int age = sc.nextInt();
				dto.setAge(age);
				
				System.out.println("Enter the gender");
				String gender = sc.next();
				dto.setGender(gender);
				
				AddressDTO addressDTO = new AddressDTO();
				System.out.println("Enter Address Details");
				System.out.println("Enter Address Id");
				addressDTO.setAddressId(sc.nextInt());
				
				CountryDTO countryDTO = new CountryDTO();
				System.out.println("Enter country id");
		        countryDTO.setCountryId(sc.nextInt());
		        System.out.println("Enter Country Name");
		        countryDTO.setCountryname(sc.next());
		        
		        StateDTO stateDTO = new StateDTO();
		        System.out.println("Enter state id");
		        stateDTO.setStateId(sc.nextInt());
		        System.out.println("Enter state name");
		        stateDTO.setStateName(sc.next());
		        
		        DistrictDTO districtDTO = new DistrictDTO();
		        System.out.println("Enter District ID");
		        districtDTO.setDistrictId(sc.nextInt());
		        System.out.println("Enter district name");
		        districtDTO.setDistrictName(sc.next());
		        
		        AreaDTO areaDTO = new AreaDTO();
		        System.out.println("Enter Area Id");
		        areaDTO.setAreaId(sc.nextInt());
		        System.out.println("Enter Area name");
		        areaDTO.setAreaName(sc.next());
		        
		        StreetDTO streetDTO = new StreetDTO();
		        System.out.println("Enter Street Id");
		        streetDTO.setStreetId(sc.nextInt());
		        System.out.println("Enter Street Name");
		        streetDTO.setStreetName(sc.next());
		        System.out.println("Enter Street No");
		        streetDTO.setStreetNo(sc.nextInt());
		        
		        dto.setAddress(addressDTO);
		        addressDTO.setCountryDTO(countryDTO);
		        countryDTO.setStateDTO(stateDTO);
		        stateDTO.setDistrictDTO(districtDTO);
		        districtDTO.setAreaDTO(areaDTO);
		        areaDTO.setStreetDTO(streetDTO);
		       
				boolean isAdded = hospitall.createPatient(dto);
				System.out.println(isAdded);
					
				}
				hospitall.getAllPatients();
			
			
			System.out.println("\n"+"Enter the patient name");
			String patientName = sc.next();
			System.out.println(hospitall.getPatientByName(patientName));
			
			System.out.println("\n"+"Enter the patient ID");
			int patientId = sc.nextInt();
			System.out.println(hospitall.getPatientById(patientId));
			
			System.out.println("\n"+"Enter patient Age");
			int age=sc.nextInt();
			System.out.println(hospitall.getPatientByAge(age));
			
			System.out.println("\n"+"Enter street name to get patinent name");
			String street=sc.next();
			System.out.println(hospitall.getPatientByStreetName(street));
			
			System.out.println("\n"+"Enter state name to get patinent name");
			String state=sc.next();
			System.out.println(hospitall.getPatientByState(state));
			
			System.out.println("\n"+"Enter Area name to get patinent name");
			String area=sc.next();
			System.out.println(hospitall.getPatientByArea(area));
			
			System.out.println("\n"+"Enter street No to get patinent name");
			int no=sc.nextInt();
			System.out.println(hospitall.getPatientByStreetNo(no));
			
			System.out.println("\n"+"Enter patient id and contact number to update");
			int id=sc.nextInt();
			long con=sc.nextLong();
			hospitall.updatePatientContactNoById(id,con);
			
			hospitall.getAllPatients();
			
			System.out.println("\n"+"Enter patient Id to delete");
			int id1=sc.nextInt();
			hospitall.deletePatientById(id1);
			
			hospitall.getAllPatients();
			
			}
			else
			{
				System.out.println("invalid");
			}
		
		}
	}
