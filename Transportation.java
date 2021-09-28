class Transportation{
int price;
String distance;
String place;
String modes[] = {"Car","Bus","Train","Aeroplane","Bike"};

public Transportation(){
this(78,"75 km","Bagalkot");
System.out.println("Transportation object is created");
}
public Transportation(int price,String distance,String place){
this.price=price;
this.distance=distance;
this.place=place;
this.modes=modes;
}
public void displayTransportation(){
System.out.println(this.price +" "+ this.distance +" "+ this.place);
}
public void getModes(){
for(int i=0;i<this.modes.length;i++){
System.out.println(this.modes[i]);
}
}
}