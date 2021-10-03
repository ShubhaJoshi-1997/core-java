class IbmTester{

public static void main(String a[]){
Ibm ibm = new Ibm();
ibm.companyName = "IBM";
ibm.location = "Bangalore";
ibm.employees = 345900;
ibm.foundation = 1924;
ibm.founder = "Charles Ranlett Flint";
String service = ibm.service();
System.out.println(service);
ibm.displayDetails();
}
}