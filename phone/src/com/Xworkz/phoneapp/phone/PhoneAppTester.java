package com.Xworkz.phoneapp.phone;

import java.util.Scanner;

import com.Xworkz.phoneapp.dto.ContactsDTO;


public class PhoneAppTester {

	public static void main(String a[]){

		System.out.println("\n"+"Enter the number of contacts");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		PhoneApp phoneApp = new PhoneApp(size);
		if(size>0)
		{	
			for(int i = 0; i< size; i++)
			{
			ContactsDTO dto = new ContactsDTO();
			System.out.println("Enter the company details");
			
			System.out.println("Enter the contact ID");
			int contactId = sc.nextInt();
			dto.setContactId(contactId);
			
			System.out.println("Enter the contact name");
			String contactName = sc.next();
			dto.setContactName(contactName);
			
			boolean isAdded = phoneApp.createContactsDetails(dto);
			System.out.println(isAdded);
			}
				
			int choice;
			String text;
			do {
				System.out.println("Press 1 to get all Contacts");
				System.out.println("Press 2 to get all Contacts by Name");
				System.out.println("Press 3 to get all Contacts by Id");
				System.out.println("Enter the choice:-");
				choice = sc.nextInt();
				switch(choice){
				case 1: phoneApp.getAllContacts();
				break;
				case 2: System.out.println("Enter the Contact Name"); 
					ContactsDTO dto =phoneApp.getContactByName(sc.next());
					   if(dto!=null)
					   {
						   System.out.println("dto");
					   }
					   else {
						   System.out.println("No Contact Found by Name");
					   }
				break;
				case 3:System.out.println("Enter the Contact Id");
				ContactsDTO dto1=phoneApp.getContactById(sc.nextInt());
				if(dto1!=null)
				{
					System.out.println("dto1");
				}
				else {
					System.out.println("No Contact Found by Id");
				}
				break;
				default:
				System.out.println("Gube Invalid Choice.......Please provide valid choice");
				}
				System.out.println("do you want to continue??? press y/n");
				text=sc.next();
				
			}while(text.equals("y"));
			//System.out.println(city.getContactByName(sc.next()));
				}
			
			System.out.println("\n"+"Enter contact Id to delete");
			int id1=sc.nextInt();
		    phoneApp.deleteContactById(id1);
			
			phoneApp.getAllContacts();
			
			}
			
		
		

}

