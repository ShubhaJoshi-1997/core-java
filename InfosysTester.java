class InfosysTester{

public static void main(String a[]){
Infosys infosys = new Infosys();
infosys.companyName = "Infosys";
infosys.location = "Pune";
infosys.employees = 259619;
infosys.foundation = 1981;
infosys.founder = "Narayan Murthy";
String service = infosys.service();
System.out.println(service);
infosys.displayDetails();
}
}