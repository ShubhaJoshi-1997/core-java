class PatientUtil{

public static void main(String a[]){
System.out.println("main method started");

PatientDTO dto=new PatientDTO();
dto.setPatientId(1234);
dto.setPatientName("Shwetha");
dto.setAge(24);
dto.setGender("female");
dto.setAddress("Bagalkot");
dto.setBloodGroup("O+");
System.out.println(dto.hashCode());
System.out.println("main method ended");
System.out.println("Default value of hashcode"+dto.hashCode());
}
}

