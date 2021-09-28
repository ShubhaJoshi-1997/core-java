class Appliances{

String Name;
int shopId;
String location;
String ownerName;
boolean isOpen;
String items[] = { "Refrigerator" , "Washing Machine" , "Iron" , "Oven" , "Mixer"};

public Appliances(){
	this("S V Marketing" , "Rajajinagar" , 23 , "Pramod" ,true);
System.out.println("Appliances  object is created");

}

public Appliances(String Name,
                          String location ,int shopId  ,String ownerName ,boolean isOpen){
	this.Name = Name;
	this.shopId = shopId;
	this.location = location;
	this.ownerName = ownerName;
	this.items = items;
	this.isOpen = isOpen;
}
public void displayAppliances(){
	System.out.println(this.Name+" "+ this.shopId+" "+ this.location+" "+ this.ownerName+" "+ this.isOpen);
}
public void getItems(){
	for(int i=0 ; i < this.items.length; i++){
		System.out.println(this.items[i]);
	}
}
} 
