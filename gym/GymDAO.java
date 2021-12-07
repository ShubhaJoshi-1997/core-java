package com.Xworkz.projectapp.gym;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GymDAO {
private Collection<String> gymNameCollection = new ArrayList<String>();
	
	public boolean save(String gymName) {
		return gymNameCollection.add(gymName);
				}
	public boolean find(String name) {
		return gymNameCollection.contains(name);
	}
	public boolean findByCaseInSensitive(String name) {
		Iterator<String>itr = gymNameCollection.iterator();
		while (itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(tempName)) {
				return true;
			}
		}
		return false;
	}
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator<String>itr = gymNameCollection.iterator();
		while (itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(tempName)) {
				return true;}
		}
		return false;
	}
}
