class SingletonTester1{

public static void main(String a[]){

Fan fan= Fan.getFan();

Fan fan1=new Fan();
System.out.println(fan1);

Fan fan2=new Fan();
System.out.println(fan2);

}
}

