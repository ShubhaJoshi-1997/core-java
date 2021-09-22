class ShirtUtil{

public static void main(String a[]){
Shirt shirt = new Shirt();
shirt.type="cotton";
shirt.color="black";
shirt.price=800;

System.out.println(shirt.type +" "+shirt.color +" "+ shirt.price);
shirt.wear(); 

Shirt shirt1 = new Shirt();
shirt1.type="khadi";
shirt1.color="white";
shirt1.price=1000;

System.out.println(shirt1.type +" "+shirt1.color +" "+ shirt1.price);
shirt1.wear(); 

}
}