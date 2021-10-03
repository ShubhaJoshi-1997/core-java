class CapgeminiTester{

public static void main(String a[]){
Capgemini capgemini = new Capgemini();
capgemini.companyName = "Capgemini";
capgemini.location = "Chennai";
capgemini.employees = 270000;
capgemini.foundation = 1967;
capgemini.founder = "Serge Kampf";
String service = capgemini.service();
System.out.println(service);
capgemini.displayDetails();
}
}