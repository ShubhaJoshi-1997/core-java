import java.util.*;
class HospitalTester{
public static void main(String a[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter size");
int size = sc.nextInt();
Hospital hospital = new Hospital(5);

for (int i=0;i<size;i++){
PatientDTO dto = new PatientDTO();
System.out.println("Enter the patient details");
System.out.println("enter the PatientId");
int patientId = sc.nextInt();
System.out.println("enter the patientName");
String patientName= sc.next();
System.out.println("enter the contactNo");
long contactNo=sc.nextLong();
System.out.println("enter the address");
String address=sc.next();
System.out.println("enter the bloodGroup");
String bloodGroup=sc.next();
System.out.println("enter the age");
int age = sc.nextAge();
System.out.println("enter the gender");
char gender = sc.next.char@(0);
dto.setPatientId(patientId);
dto.setPatientName(patientName);
dto.setContactNo(contactNo);
dto.setAddress(address);
dto.setBloodGroup(bloodGroup);
dto.setAge(age);

boolean isAdded=hospital.createPatientDetails(dto);
System.out.println(isAdded);

hospital.getAllPatients();

}
}

}

