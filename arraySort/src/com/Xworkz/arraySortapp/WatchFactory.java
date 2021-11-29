package com.Xworkz.arraySortapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class WatchFactory {
		    
		public static void main(String[] args) {
		
			Collection collection = new ArrayList<>();
		
			String[] watchName={"Titan","Fast track","Rolex","Casio"};
			    
			      //Sorting the array in ascending order
			       Arrays.sort(watchName);
			       System.out.println(Arrays.toString(watchName));
			       
			       //Sorting the array in descending order
			       Arrays.sort(watchName,Collections.reverseOrder());
			       System.out.println(Arrays.toString(watchName));
	    }
	}


