class Museum{

String type;
String location;
int entryFees;
boolean isOpen;


public Museum(){
this("Art Science","Bangalore",15,true);
System.out.println("Museum object is created");
}
public Museum(String type,String location,int entryFees, boolean isOpen){
this.type=type;
this.location=location;
this.isOpen=isOpen;
this.entryFees=entryFees;
}
public void displayMuseum(){
System.out.println(this.type +" "+ this.location +" "+this.entryFees+" "+ this.isOpen );
}

}
