package com.Xworkz.shopapp.dto.shop;

import com.Xworkz.shopapp.dto.ElectronicGadgetsDTO;

public class Shop {
		public ElectronicGadgetsDTO[] gadgets ;
		  private int index;

		public Shop(int size){
		  gadgets=new ElectronicGadgetsDTO[size];
		}
		
		public boolean createGadgetsDetails(ElectronicGadgetsDTO gadgets){
			boolean gadgetsAdded=false;
			System.out.println("inside createGadgets()");
			if(gadgets!=null){
			  this.gadgets[index++]=gadgets;
			  gadgetsAdded=true;
			}

			else{
			System.out.println("No Gadgets added");
			return gadgetsAdded=false;
			}
			return gadgetsAdded;
			}
		
		public void getAllGadgets(){
			for(int i=0;i<gadgets.length;i++){
			System.out.println(gadgets[i]);
			}
			}
		
		public ElectronicGadgetsDTO getGadgetByName(String gadgetName){
			ElectronicGadgetsDTO electronicGadgetsDTO=null;
			System.out.println("inside getGadgetByName()");
			if(gadgetName!=null){
			   for(int i=0;i<gadgets.length;i++){
			     if(gadgets[i].getGadgetName().equals(gadgetName)){
			System.out.println("Gadget found by Name:"+gadgetName);
			   electronicGadgetsDTO=gadgets[i];
			     }
			  
			else{
			System.out.println("No Gadget Found by Name:"+gadgetName);
			}
			   }
			}
			return electronicGadgetsDTO;
			}
	    

	    public ElectronicGadgetsDTO getGadgetById(int gadgetId){
		ElectronicGadgetsDTO electronicGadgetsDTO=null;
		System.out.println("inside getGadgetById()");
		if(gadgetId!=0){
			for(int i=0;i<gadgets.length;i++){
				int gadgetId1;
				if(gadgets[i].getGadgetId1()==(gadgetId
						1)){
				System.out.println("Gadget found by Id:"+gadgetId);
		  
		   electronicGadgetsDTO=gadgets[i];
		     }
		  
		else{
		System.out.println("No Gadget Found by Id:"+gadgetId);
		}
		   }
		}
		return electronicGadgetsDTO;
	}
	    
	    public ElectronicGadgetsDTO getGadgetByPrice(int gadgetPrice){
	    	ElectronicGadgetsDTO electronicGadgetsDTO=null;
	    	System.out.println("inside getGadgetByPrice()");
	    	if(gadgetPrice!=0) {
	    		for(int i=0;i<gadgets.length;i++){
		    	     if(gadgets[i].getGadgetId()==(gadgetPrice)){
	    				System.out.println("Gadget found by Price:"+gadgetPrice);
	    				
	    				
	    		electronicGadgetsDTO=gadgets[i];
	    	     }
	    	  
	    	else{
	    	System.out.println("No Gadget Found by Id:"+gadgetPrice);
	    	}
	    	   }
	    	}
	    	return electronicGadgetsDTO;
	    }
	   
	    public void updateGadgetPriceByGadgetId(int gadgetId,int gadgetPrice){
	    	System.out.println("inside updateGadgetPriceByGadgetId()");
	    	if(gadgetId>0&&gadgetPrice>0){
	    	  for(int i=0;i<gadgets.length;i++){
	    		if(gadgets[i].getGadgetId1()==(gadgetId)){
	    		System.out.println("Gadget Price updated by:"+gadgetPrice);
	    	   gadgets[i].setGadgetPrice(gadgetPrice);
	    	     }

	    	else{
	    	System.out.println("Gadget not updated");
	    	}
	    	   }
	    	}
	    }


	    public void deleteGadgetById(int gadgetId){
	    	System.out.println("Inside deleteGadgetById()");
	    	if(gadgetId > 0){
	    	for(int i=0; i<gadgets.length; i++){
	    	if(gadgets[i].getGadgetId()==(gadgetId)){
	    	System.out.println("Gadget deleted by id : "+gadgetId);
	    	gadgets[i].setGadgetId(gadgetId);
	    	}
	    	
	    	
	    	else{
	    	System.out.println("Gadget is not deleted");
	    	}
	    	}
	    	}
	    			
	    }
	    }


