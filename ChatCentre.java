class ChatCentre{

String centreName;
int centreId;
String location;
String ownerName;
boolean isOpen;
String items[] = { "Pani Puri" , "Kachori" , "Samosa" , "Pav Bhaji" , "Sandwich"};

public ChatCentre(){
	this("Sai Chats" , "near KLE Ground" , 2 , "Shrikant" ,true);
System.out.println("ChatCentre object is created");

}

public ChatCentre(String centreName,
                          String location ,int centreId  ,String ownerName ,boolean isOpen){
	this.centreName = centreName;
	this.centreId = centreId;
	this.location = location;
	this.ownerName = ownerName;
	this.items = items;
	this.isOpen =isOpen;
}
public void displayChatCentre(){
	System.out.println(this.centreName+" "+ this.centreId+" "+ this.location+" "+ this.ownerName+" "+ this.isOpen);
}
public void getItems(){
	for(int i=0 ; i < this.items.length; i++){
		System.out.println(this.items[i]);
	}
}
} 
