class DeloitteTester{

public static void main(String a[]){
Deloitte deloitte = new Deloitte();
deloitte.companyName = "Deloitte";
deloitte.location = "Pune";
deloitte.employees = 334800;
deloitte.foundation = 1845;
deloitte.founder = "William Welch Delloite";
String service = deloitte.service();
System.out.println(service);
deloitte.displayDetails();
}
}