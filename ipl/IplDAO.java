package com.Xworkz.projectapp.ipl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplDAO {
	private Collection<String> iplTeamNameCollection = new ArrayList<String>();
	
	public boolean save(String iplTeamName) {
		return iplTeamNameCollection.add(iplTeamName);
				}
	public boolean find(String name) {
		return iplTeamNameCollection.contains(name);
	}
	public boolean findByCaseInSensitive(String name) {
		Iterator<String>itr = iplTeamNameCollection.iterator();
		while (itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(tempName)) {
				return true;
			}
		}
		return false;
	}
	public boolean findByCaseInSensitiveAndTrimmed(String name) {
		Iterator<String>itr = iplTeamNameCollection.iterator();
		while (itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(tempName)) {
				return true;}
		}
		return false;
	}


	

}
