class CorporationTester{

public static void main(String a[]){

Bank bank = new CorporationBank();// up-casting
CorporationBank corporationBank=(CorporationBank)bank;// down casting
 
System.out.println(bank);

Bank bank1=new CorporationBank();

System.out.println(bank1);

Bank bank2=new CorporationBank();
System.out.println(bank2);

Bank bank3=new CorporationBank();

System.out.println(bank3);

}
}
