class ShoeUtil{

public static void main(String a[]){
Shoe shoe = new Shoe();
shoe.company="Bata";
shoe.color="black";
shoe.price=2000;

System.out.println(shoe.company +" "+shoe.color +" "+ shoe.price);
shoe.walk(); 

Shoe shoe1 = new Shoe();
shoe1.company="Paragon";
shoe1.color="white";
shoe1.price=1000;

System.out.println(shoe1.company +" "+shoe1.color +" "+ shoe1.price);
shoe1.walk(); 


}
}