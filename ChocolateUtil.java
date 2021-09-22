class ChocolateUtil{

public static void main(String a[]){
Chocolate chocolate = new Chocolate();
chocolate.name="Dairymilk";
chocolate.color="Brown";
chocolate.price=80;

System.out.println(chocolate.name +" "+chocolate.color+" "+chocolate.price);

chocolate.eat();
Chocolate chocolate1 = new Chocolate();
chocolate1.name="Milkybar";
chocolate1.color="white";
chocolate1.price=20;

System.out.println(chocolate1.name +" "+chocolate1.color+" "+chocolate1.price); 

chocolate1.eat();
}
}