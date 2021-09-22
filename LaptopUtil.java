class LaptopUtil{

public static void main(String a[]){
Laptop laptop = new Laptop();
laptop.company = "lenovo";
laptop.price=38000;
laptop.type="screentouch";

System.out.println(laptop.company +" "+laptop.price+" "+laptop.type);

laptop.type();

Laptop laptop1 = new Laptop();
laptop1.company = "redmi";
laptop1.price=35000;
laptop1.type="digital";

System.out.println(laptop1.company +" "+laptop1.price+" "+laptop1.type);

laptop1.type();


}
}