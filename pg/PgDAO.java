package com.Xworkz.projectapp.pg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PgDAO {
	private Collection<String> pgNameCollection = new ArrayList<String>();
	
	public boolean save(String pgName) {
		return pgNameCollection.add(pgName);
				}
	public boolean find(String name) {
		return pgNameCollection.contains(name);
	}
	public boolean findByCaseInSensitive(String name) {
		Iterator<String>itr = pgNameCollection.iterator();
		while (itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(tempName)) {
				return true;
			}
		}
		return false;
	}
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator<String>itr = pgNameCollection.iterator();
		while (itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(tempName)) {
				return true;}
		}
		return false;
	}


	}

