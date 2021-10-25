class HospitalTester{
public static void main(String a[]){

Hospital hospital = new Hospital(5);

PatientDTO dto = new PatientDTO();
dto.setPatientId(1);
dto.setPatientName("Pallavi");
dto.setAddress("jayanagar");
dto.setAge(24);
dto.setGender('F');
dto.setBloodGroup("AB+ve");
dto.setContactNo(8618524603L);


PatientDTO dto1 = new PatientDTO();
dto1.setPatientId(2);
dto1.setPatientName("Mahima");
dto1.setAddress("Basaveshwar Nagar");
dto1.setAge(46);0
dto1.setGender('F');
dto1.setBloodGroup("B+ve");
dto1.setContactNo(7337743439L);

PatientDTO dto2 = new PatientDTO();
dto2.setPatientId(1);
dto2.setPatientName("Rohit");
dto2.setAddress("Bagalkot");
dto2.setAge(45);
dto2.setGender('M');
dto2.setBloodGroup("O-ve");
dto2.setContactNo(9764490077L);

PatientDTO dto3 = new PatientDTO();
dto3.setPatientId(3);
dto3.setPatientName("Varsha");
dto3.setAddress("Rajajinagar");
dto3.setAge(19);
dto3.setGender('F');
dto3.setBloodGroup("O-ve");
dto3.setContactNo(9448671401L);

PatientDTO dto4 = new PatientDTO();
dto4.setPatientId(4);
dto4.setPatientName("Pavan");
dto4.setAddress("Malleshwaram");
dto4.setAge(32);
dto4.setGender('M');
dto4.setBloodGroup("O-ve");
dto4.setContactNo(9845245063L);

boolean isAdded=hospital.createPatientDetails(dto);
System.out.println(isAdded);
boolean isAdded1=hospital.createPatientDetails(dto1);
System.out.println(isAdded1);
boolean isAdded2=hospital.createPatientDetails(dto2);
System.out.println(isAdded2);
boolean isAdded3=hospital.createPatientDetails(dto3);
System.out.println(isAdded3);
boolean isAdded4=hospital.createPatientDetails(dto4);
System.out.println(isAdded4);

hospital.getAllPatients();

}
}