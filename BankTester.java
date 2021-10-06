class BankTester{
public static void main(String a[]){
	
Bank bank = new BandhanBank();
bank.provideLoans(7.5);
System.out.println(bank);

Bank bank1 = new HDFCBank();
bank1.provideLoans(6.5);
System.out.println(bank1);

Bank bank2 = new DenaBank();
bank.provideLoans(8.5);
System.out.println(bank2);

Bank bank3 = new CanaraBank();
bank.provideLoans(9.0);
System.out.println(bank3);

Bank bank4 = new BarodaBank();
bank.provideLoans(7.0);
System.out.println(bank4);

Bank bank5 = new ICICIBank();
bank.provideLoans(5.5);
System.out.println(bank5);
}
}