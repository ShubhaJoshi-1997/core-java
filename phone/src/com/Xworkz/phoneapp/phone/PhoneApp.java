package com.Xworkz.phoneapp.phone;

import com.Xworkz.phoneapp.dto.ContactsDTO;

public class PhoneApp {
	public ContactsDTO[] contacts ;
	  private int index;

	public PhoneApp(int size){
	 contacts=new ContactsDTO[size];
	}
	
	public boolean createContactsDetails(ContactsDTO contacts){
		boolean contactsAdded=false;
		System.out.println("inside createContacts()");
		if(contacts!=null){
		  this.contacts[index++]=contacts;
		  contactsAdded=true;
		}

		else{
		System.out.println("No Contacts added");
		return contactsAdded=false;
		}
		return contactsAdded;
		}
	
	public void getAllContacts(){
		for(int i=0;i<contacts.length;i++){
		System.out.println(contacts[i]);
		}
		}
	
	public ContactsDTO getContactByName(String contactName){
		ContactsDTO companiesDTO=null;
		System.out.println("inside getContactByName()");
		if(contactName!=null){
		   for(int i=0;i<contacts.length;i++){
		     if(contacts[i].getContactName().equals(contactName)){
		System.out.println("Contact found by Name:"+contactName);
		      ContactsDTO contactsDTO = contacts[i];
		     }
		  
		else{
		System.out.println("No Contact Found by Name:"+contactName);
		}
		   }
		}
		return companiesDTO;
		}
  

  public ContactsDTO getContactById(int contactId){
	ContactsDTO contactsDTO=null;
	System.out.println("inside getContactById()");
	if(contactId!=0){
	   for(int i=0;i<contacts.length;i++){
	     if(contacts[i].getContactId()==(contactId)){
	System.out.println("Company found by Id:"+contactId);
	   contactsDTO=contacts[i];
	     }
	  
	else{
	System.out.println("No Contact Found by Id:"+contactId);
	}
	   }
	}
	return contactsDTO;
}
  
 
  


  public void deleteContactById(int contactId){
  	System.out.println("Inside deleteContactById()");
  	if(contactId > 0){
  	for(int i=0; i<contacts.length; i++){
  	if(contacts[i].getContactId()==(contactId)){
  	System.out.println("Contact deleted by id : "+contactId);
  	contacts[i].setContactId(contactId);
  	}
  	
  	
  	else{
  	System.out.println("Contact is not deleted");
  	}
  	}
  	}
  			
  }
  }
  	


