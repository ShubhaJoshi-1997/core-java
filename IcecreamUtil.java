class IcecreamUtil{

public static void main(String a[]){
Icecream icecream = new Icecream();
icecream.flavour="Chocolate";
icecream.color="Brown";
icecream.price=50;

System.out.println(icecream.flavour +" "+ icecream.color+" "+ icecream.price);

icecream.eat();
Icecream icecream1 = new Icecream();
icecream1.flavour="Butterscotch";
icecream1.color="yellow";
icecream1.price=60;

System.out.println(icecream1.flavour +" "+ icecream1.color+" "+ icecream1.price);

icecream.eat();

}
}