package com.Xworkz.shopapp.dto;

public class ElectronicGadgetsDTO {
		public ElectronicGadgetsDTO(){
			System.out.println(this.getClass().getSimpleName()+"object created");
			}

			   private int gadgetId;
			   private String gadgetName;
			   private int gadgetPrice;
			   
			   public void setGadgetId(int gadgetId){
					this.gadgetId=gadgetId;
					}

				public int getGadgetId(){
					return gadgetId;
					}

				public void setGadgetName(String gadgetName){
					this.gadgetName=gadgetName;
					}

				public String getGadgetName(){
					return gadgetName;
					}
				
				public void setGadgetPrice(int gadgetPrice){
					this.gadgetPrice=gadgetPrice;
					}

				public int getGadgetPrice(){
					return gadgetPrice;
					}
				
				@Override
				public String toString(){
	return"ElectronicGadgetsDTO-{gadgetId="+this.gadgetId+",gadgetName="+this.gadgetName+",gadgetPrice="+this.gadgetPrice+"}";
				}

				public int getGadgetId1() {
					// TODO Auto-generated method stub
					return 0;
				}

				public int ElectronicGadgets() {
					// TODO Auto-generated method stub
					return 0;
				}
				}

			   

