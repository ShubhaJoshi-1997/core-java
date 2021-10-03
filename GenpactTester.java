class GenpactTester{

public static void main(String a[]){
Genpact genpact = new Genpact();
genpact.companyName = "Genpact";
genpact.location = "Hyderabad";
genpact.employees = 96500;
genpact.foundation = 1997;
genpact.founder = "Pramod Bhasin";
String service = genpact.service();
System.out.println(service);
genpact.displayDetails();
}
}