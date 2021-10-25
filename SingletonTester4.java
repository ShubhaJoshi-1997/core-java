class SingletonTester4{

public static void main(String a[]){

Bank bank= Bank.getbank();

Bank bank1=new Bank();
System.out.println(bank1);

Bank bank2=new Bank();
System.out.println(bank2);

Bank bank3=new Bank();
System.out.println(bank3);

Bank bank4=new Bank();
System.out.println(bank4);

}
}