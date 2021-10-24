class SyndicateTester{

public static void main(String a[]){

Bank bank = new SyndicateBank();
SyndicateBank syndicateBank=(SyndicateBank)bank;

bank.provideLoans(9.0); 
System.out.println(bank);

Bank bank1=new SyndicateBank();
bank1.provideLoans(9999);
System.out.println(bank1);

Bank bank2=new SyndicateBank();
bank2.provideLoans(1.1);
System.out.println(bank2);

Bank bank3=new SyndicateBank();
bank3.provideLoans(201);
System.out.println(bank3);

Bank bank4=new SyndicateBank();
bank4.provideLoans(1.0);
System.out.println(bank4);

Bank bank5=new SyndicateBank();
bank5.provideLoans(10);
System.out.println(bank5);

}
}
