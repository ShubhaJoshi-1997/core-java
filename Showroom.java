class Showroom{
public String company;
public String color;
public double price;
public String location;

public Showroom(String company,String color,long price,String location){
System.out.println("Showroom object is created");
this.company = company;
this.color = color;
this.price = price;
this.location = location;
System.out.println(company +" "+ color +" "+ price +" "+ location);
}
public static void main(String a[]){
Showroom showroom = new Showroom("Tiago","White",450000L,"Malleshwaram");
Showroom showroom1= new Showroom("Maruti","Black",500000L,"Jayanagar");
Showroom showroom2 = new Showroom("Swift","Red",600000L,"Koramangala");
}
}