class PatientUtil{

public static void main(String a[]){

PatientDTO dto = new PatientDTO();
 dto.setPatientName("Shubha");
 dto.setAge(23);
 dto.setAddress("Bagalkot");
 dto.setPatientId(641764173298L);
 dto.setBloodGroup("AB+");
 dto.setGender("Female");
 
 System.out.println(dto.getPatientName()+" "+dto.getAge()+" "+dto.getAddress()+" "+dto.getPatientId()+" "+dto.getBloodGroup()+" "+dto.getGender());
 }
 }
 