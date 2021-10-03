class WiproTester{

public static void main(String a[]){
Wipro wipro = new Wipro();
wipro.companyName = "Wipro";
wipro.location = "Bangalore";
wipro.employees = 209890;
wipro.foundation = 1945;
wipro.founder = "Hasham Premji";
String service = wipro.service();
System.out.println(service);
wipro.displayDetails();
}
}