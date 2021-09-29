public class PatientDTO{

public PatientDTO(){
System.out.println("PatientDTO object is created");

}
private String patientName;
private int age;
private String address;
private long patientId;
private String bloodGroup;
private String gender;

public long getPatientId(){
	return patientId;
}
public void setPatientId(long patientId){
	this.patientId=patientId;
}
public int getAge(){
	return age;
}
public void setAge(int age){
	this.age=age;
}
public String getPatientName(){
	return patientName;
}
public void setPatientName(String patientName){
	this.patientName=patientName;
}

public String getGender(){
	return gender;
}
public void setGender(String gender){
	this.gender=gender;
}
public String getBloodGroup(){
	return bloodGroup;
}
public void setBloodGroup(String bloodGroup){
	this.bloodGroup=bloodGroup;
}
public String getAddress(){
	return address;
}
public void setAddress(String address){
	this.address=address;
}
}
