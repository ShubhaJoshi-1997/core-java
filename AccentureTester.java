class AccentureTester{

public static void main(String a[]){
Accenture accenture = new Accenture();
accenture.companyName = "Accenture";
accenture.location = "Dublin";
accenture.employees = 62400;
accenture.foundation = 1989;
accenture.founder = "Clarence DeLany";
String service = accenture.service();
System.out.println(service);
accenture.displayDetails();
}
}