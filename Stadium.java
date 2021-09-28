class Stadium{
public String name;
public int capacity;
public String location;

public Stadium(String name,int capacity,String location){
System.out.println("Stadium object is created");
this.name = name;
this.capacity = capacity;
this.location = location;
System.out.println(name +" "+ capacity +" "+ location);
}
public static void main(String a[]){
Stadium stadium = new Stadium("Chennaswamy",40000,"Bangalore");
Stadium stadium1 = new Stadium("Kanteerava",25810,"Sampangirama Nagar");
Stadium stadium2 = new Stadium("Ranna",6000,"Mudhol");
}
}