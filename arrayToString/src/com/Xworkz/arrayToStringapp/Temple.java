package com.Xworkz.arrayToStringapp;

import java.util.ArrayList;
import java.util.Collection;

public class Temple {
public static void main(String a[]){
		
		Collection collection = new ArrayList<>();
		collection.add("Venkatesh");
		collection.add("Ganesh");
		collection.add("Banshankaridevi");
		collection.add("Anjaneya");
		
		
		 System.out.println(collection.size());
		    collection.toString();
		    collection.forEach(System.out::println);

		
		
		}

}

