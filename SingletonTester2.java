class SingletonTester2{

public static void main(String a[]){

Tester tester= Tester.gettester();

Tester tester1=new Tester();
System.out.println(tester1);

Tester tester2=new Tester();
System.out.println(tester2);

Tester tester3=new Tester();
System.out.println(tester3);

Tester tester4=new Tester();
System.out.println(tester4);

}
}

