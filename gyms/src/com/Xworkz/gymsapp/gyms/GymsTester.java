package com.Xworkz.gymsapp.gyms;

import java.util.Scanner;

import com.Xworkz.gymsapp.dto.EquipmentsDTO;

public class GymsTester {

	public static void main(String a[]){

	       System.out.println("\n"+"Enter the number of Equipments");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();

			Gyms gyms = new Gyms(size);

			 if(size>0) {
			for(int i=0;i<size;i++){

				EquipmentsDTO equi = new EquipmentsDTO();

			System.out.println("Enter the EquipmentDetails");
			
			System.out.println("Enter EquipmentId");
			int equipmentId=sc.nextInt();
			equi. setEquipmentsId(equipmentId);
			System.out.println("Enter EquipmentName");
			String equipmentName=sc.next();
			equi.setEquipmentsName(equipmentName);
			
			
			boolean isAdded=gyms.createGymEquipmentsDetails(equi);
			System.out.println("EquipmentAdded:"+isAdded);
		}
			
			gyms.getAllEquipments();
			System.out.println("\n"+"Enter the EquipmentId");
			int equipmentId=sc.nextInt();
			System.out.println(gyms.getEquipmentById(equipmentId));
			
		   System.out.println("\n"+"Enter the EquipmentName");
		   String equipmentName=sc.next();
		   System.out.println(gyms.getEquipmentByName(equipmentName));
		   
		   
		   int choice;
		   String text;
		   
		   do {
			   System.out.println("Press 1 to get All details");
			   System.out.println("Press 2 to get Application Id");
			   System.out.println("Press 3 to get Application Name");
			   choice=sc.nextInt();
			   
			   switch(choice) {
			   case 1:gyms.getAllEquipments();
			   break;
			   case 2:System.out.println("Enter equipment Id");
			   EquipmentsDTO dto1=gyms.getEquipmentByName(sc.next());
		    	 if(dto1!=null) {
		    		 System.out.println(dto1);
		    		 
		    	 }
		    	 else {
		    		 System.out.println("No equipment found by Name");
		    	 }
		    	 break;
		case 3:System.out.println("Enter the equipment Id");
		EquipmentsDTO dto2=gyms.getEquipmentById(sc.nextInt());
		       if(dto2!=null) {
		    	   System.out.println(dto2);
		       }
		       else {
		    	   System.out.println("No equipment found by Id");
		       }
		       
		       default:
		    	 System.out.println("invalid Choice");
		}
		       System.out.println("do want continue press y/n");
		       text=sc.next();
		       
		}  
		       while(text.equals("y"));
		    //System.out.println(getMobileByApplicationName(sc.next());	   
		        
		
	
	System.out.println("\n"+"Enter equipment Id and equipment name to be updated");
	int id=sc.nextInt();
	String name=sc.next();
	gyms.updateEquipmentNameByEquipmentId(name, id);
	gyms.getAllEquipments();
	
	
	System.out.println("\n"+"Enter id to be deleted");
	int id1=sc.nextInt();
	gyms.deleteEquipmentById(id1);
	gyms.getAllEquipments();
	
}

	else {
		System.out.println("invalid");
	}

		
}
		}

