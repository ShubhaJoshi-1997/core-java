class FancyStore{

String storeName;
int storeId;
String location;
String ownerName;
boolean isOpen;
String items[] = { "Perfumes" , "Bangles" , "Ear rings" , "Stickers" , "Necklaces"};

public FancyStore(){
	this("Gaurav Fancy Store" , "Bommanahalli" , 8 , "Ranganath" ,true);
System.out.println("FancyStore  object is created");

}

public FancyStore(String storeName,
                          String location ,int storeId  ,String ownerName ,boolean isOpen){
	this.storeName = storeName;
	this.storeId = storeId;
	this.location = location;
	this.ownerName = ownerName;
	this.items = items;
	this.isOpen = isOpen;
}
public void displayFancyStore(){
	System.out.println(this.storeName+" "+ this.storeId+" "+ this.location+" "+ this.ownerName+" "+ this.isOpen);
}
public void getItems(){
	for(int i=0 ; i < this.items.length; i++){
		System.out.println(this.items[i]);
	}
}
} 
