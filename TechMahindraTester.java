class TechMahindraTester{

public static void main(String a[]){
TechMahindra techMahindra = new TechMahindra();
techMahindra.companyName = "TechMahindra";
techMahindra.location = "Mumbai";
techMahindra.employees = 125236;
techMahindra.foundation = 1986;
techMahindra.founder = "Anant Mahindra";
String service = techMahindra.service();
System.out.println(service);
techMahindra.displayDetails();
}
}