class TcsTester{

public static void main(String a[]){
Tcs tcs = new Tcs();
tcs.companyName = "TCS";
tcs.location = "Hyderabad";
tcs.employees = 506058;
tcs.foundation = 1968;
tcs.founder = "Tata Sons";
String service = tcs.service();
System.out.println(service);
tcs.displayDetails();
}
}