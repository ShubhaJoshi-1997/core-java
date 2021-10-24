class HospitalTester{
public static void main(String a[]){
	
Hospital hospital = new Hospital(5);
PatientDTO dto1 = new PatientDTO();
dto1.setPatientId(1);
dto1.setPatientName("Shubha");
dto1.setcontactNo(7337743439L);
dto1.setAddress("Gaddankeri");
dto1.setAge(24);
dto1.setGender('F');
dto1.setBloodGroup("AB+");

PatientDTO dto2 = new PatientDTO();
dto2.setPatientId(2);
dto2.setPatientName("Varsha");
dto2.setcontactNo(9448671401L);
dto2.setAddress("Bagalkot");
dto2.setAge(19);
dto2.setGender('F');
dto2.setBloodGroup("O+");

PatientDTO dto3 = new PatientDTO();
dto3.setPatientId(3);
dto3.setPatientName("Swapna");
dto3.setcontactNo(8310315037L);
dto3.setAddress("Dharwad");
dto3.setAge(15);
dto3.setGender('F');
dto3.setBloodGroup("A+");

PatientDTO dto4 = new PatientDTO();
dto4.setPatientId(4);
dto4.setPatientName("Vibha");
dto4.setcontactNo(8618524603L);
dto4.setAddress("Belgaum");
dto4.setAge(45);
dto4.setGender('F');
dto4.setBloodGroup("A-");

PatientDTO dto5 = new PatientDTO();
dto5.setPatientId(5);
dto5.setPatientName("Shrikant");
dto5.setcontactNo(9845245063L);
dto5.setAddress("Hubli");
dto5.setAge(56);
dto5.setGender('M');
dto5.setBloodGroup("O+");

boolean isAdded=hospital.createPatientDetails(dto1);
System.out.println(isAdded1);

boolean isAdded=hospital.createPatientDetails(dto2);
System.out.println(isAdded2);

boolean isAdded=hospital.createPatientDetails(dto3);
System.out.println(isAdded3);

boolean isAdded=hospital.createPatientDetails(dto4);
System.out.println(isAdded4);

boolean isAdded=hospital.createPatientDetails(dto5);
System.out.println(isAdded5);


hospital.getAllPatients();
}}