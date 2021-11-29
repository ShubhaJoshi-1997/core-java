package com.Xworkz.collectionToArrayapp;

import java.util.ArrayList;
import java.util.Collection;

public class IPL {
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		collection.add("RCB");
		collection.add("PK");
	    collection.add("DC");
	    collection.add("CSK");
	    collection.add("SRH");
	    collection.add("MI");
	    collection.add("RR");
	    collection.add("KKR");
	   
	    Object[] obj = collection.toArray();
	    for(int i=0;i<obj.length;i++) {
	    	
	    }
	    
	    System.out.println(collection.size());
	    collection.forEach(System.out::println);
	    
	}


}
