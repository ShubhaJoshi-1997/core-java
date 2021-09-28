class GasCylinder{
public String color;
public int price;
public String name;

public GasCylinder(String color,int price,String name){
System.out.println("GasCylinder is created");
this.color = color;
this.price = price;
this.name = name;
System.out.println(color + " " + price + " "+ name);
}
public static void main(String a[]){
GasCylinder gasCylinder = new GasCylinder("red",750,"HP");
GasCylinder gasCylinder1 = new GasCylinder("blue",850,"Hindustan");
GasCylinder gasCylinder2 = new GasCylinder("yellow",800,"indian");
}
}