class Metro{

String speed;
int price;
boolean isDigital;
String stopNames[]= {"Jayanagar","Majestic","Kuvempu Road","Rajajinagar"};

public Metro(){
this("95 km",15,true);
System.out.println("Metro object is created");
}
public Metro(String Speed,int price, boolean isDigital){
this.speed=speed;
this.price=price;
this.isDigital=isDigital;
this.stopNames=stopNames;
}
public void displayMetro(){
System.out.println(this.speed +" "+ this.price +" "+ this.isDigital);
}
public void getStopNames(){
for(int i=0;i<this.stopNames.length;i++){
System.out.println(this.stopNames[i]);
}
}
}