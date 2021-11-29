package com.Xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class Program {
	public static void main(String[] args) {
		//Abstraction
		Collection collection = new ArrayList<>();
		collection.add(1);
		collection.add("Snapchat");
		collection.add(314.00);
		collection.add("remote");
		collection.add(7337743439L);
		collection.add(1411.00);
		collection.add(15);
		collection.add(9480551783L);
		collection.add('D');
		collection.add(new RemoteDTO());
		collection.add(new ContinentDTO());
		collection.add(new RouterDTO());
		collection.add(new StateDTO());
		collection.add(new IcecreamDTO());
		collection.add(new JobDTO());
		collection.add(new CurrencyDTO());
		
		System.out.println(collection.size()); 
	collection.forEach(System.out::println);
		}
	}

