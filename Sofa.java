class Sofa{
public String type;
public String color;
public int price;

public Sofa(String type,String color,int price){
System.out.println("Sofa object is created");
this.type = type;
this.color = color;
this.price = price;
System.out.println(this.type+" "+ this.color+" "+this.price);
}

public static void main(String a[]){
Sofa sofa= new Sofa("wooden","white",6000);
Sofa sofa1= new Sofa("plastic","brown",2000);
Sofa sofa2= new Sofa("steel","black",3000);
}
}