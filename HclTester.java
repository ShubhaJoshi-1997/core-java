class HclTester{

public static void main(String a[]){
Hcl hcl = new Hcl();
hcl.companyName = "HCL";
hcl.location = "Chennai";
hcl.employees = 168977;
hcl.foundation = 1996;
hcl.founder = "Shiv Nadar";
String service = hcl.service();
System.out.println(service);
hcl.displayDetails();
}
}