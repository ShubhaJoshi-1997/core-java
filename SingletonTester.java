class SingletonTester{

public static void main(String a[]){

Duster duster= Duster.getDuster();

Duster duster1=new Duster();
System.out.println(duster1);

Duster duster2=new Duster();
System.out.println(duster2);

}
}

