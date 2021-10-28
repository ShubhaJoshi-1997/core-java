package com.Xworkz.phoneapp.dto;

public class ContactsDTO {
	public ContactsDTO(){
		System.out.println(this.getClass().getSimpleName()+"object created");
		}

		   private int contactId;
		   private String contactName;
		   
		   
		   public void setContactId(int contactId){
				this.contactId=contactId;
				}

			public int getContactId(){
				return contactId;
				}

			public void setContactName(String contactName){
				this.contactName=contactName;
				}

			public String getContactName(){
				return contactName;
				}

			@Override
			public String toString() {
				return "ContactsDTO [contactId=" + contactId + ", contactName=" + contactName + "]";
			}
			
}
