class Hospital{

  public PatientDTO[]patients;
  private int index;
  public static int s=0;

public Hospital(int size){
  patients=new PatientDTO[size];
}

public boolean createPatientDetails(PatientDTO patients){
boolean patientAdded=false;
System.out.println("inside createPatient()");
if(patients!=null){
  //this.patients[index++]=patients;
System.out.println(patients[index]);
  patientAdded=true;
}

else{
System.out.println("No Patient added");
return patientAdded=false;
}
return patientAdded;
}

public void getAllPatients(){
for(int i=0;i<patients.length-s;i++){
System.out.println(patients[i]);
}
}

public PatientDTO getPatientByName(String patientName){
boolean f= false;
PatientDTO patientDTO=null;
System.out.println("inside getPatientByName()");
if(patientName!=null){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getPatientName().equals(patientName)){
System.out.println("Patient found by Name:"+patientName);
   patientDTO=patients[i];
f=true;
break;
     }
else
{
f=false;
}
}
}
if(f==false)
{
System.out.println("No Patient Found by Name:"+patientName);
}
return patientDTO;
}

public PatientDTO getPatientById(int patientId){
boolean f=false;
PatientDTO patientDTO=null;
System.out.println("inside getPatientById()");
if(patientId!=0){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getPatientId()==(patientId)){
System.out.println("Patient found by PatientId:"+patientId);
   patientDTO=patients[i];
f=true;
break
     }
else{
f=false;
  }
}
}
if(f=false)
{
System.out.println("No Patient Found by PatientId:"+patientId);
}
return patientDTO;
}

public PatientDTO getPatientByAge(int age){
boolean f=false;
PatientDTO patientDTO=null;
System.out.println("inside getPatientByAge()");
if(age!=0){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getAge()==(age)){
System.out.println("Patient found by Age:"+age);
   patientDTO=patients[i];
f=true;
break;
     }
else{
f=false;
}
}
}
if(f=false)
{
System.out.println(" Patient not found");
}
return patientDTO;
}

public PatientDTO getPatientByAddress(String address){
boolean f=false;
PatientDTO patientDTO = null;
System.out.println("inside getPatientByAddress()");
if(address!=null){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getpatientAddress().equals(address)){
System.out.println("Patient found by Address:"+address);
   patientDTO=patients[i];
f=true;
break;
     }
  }
}
else{
System.out.println("No Patient Found by Address:"+address);
}
return patientDTO;
}

public PatientDTO getPatientByBloodGroup(String bloodGroup){
boolean f=false;
PatientDTO patientDTO=null;
System.out.println("inside getPatientByBloodGroup()");
if(bloodGroup!=null){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getBloodGroup().equals(bloodGroup)){
System.out.println("Patient found by BloodGroup:"+bloodGroup);
   patientDTO=patients[i];
f=true;
break;
     }
  }
}
else{
System.out.println("No Patient Found by BloodGroup:"+bloodGroup);
}
return patientDTO;
}

public PatientDTO getPatientByContactNo(long contactNo){
boolean false;
PatientDTO patientDTO=null;
System.out.println("inside getPatientByContactNo()");
if(contactNo!=0L){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getContactNo()==(contactNo)){
System.out.println("Patient found by ContactNo:"+contactNo);
   patientDTO=patients[i]; 
f=true;
break;
     }
  }
}
else{
System.out.println("No Patient Found by ContactNo:"+contactNo);
}
return patientDTO;
}

public PatientDTO getPatientByGender(String gender){
boolean false;
PatientDTO patientDTO=null;
System.out.println("inside getPatientByGender()");
if(gender!= null){
   for(int i=0;i<patients.length;i++){
     if(patients[i].getGender().equals(gender)){
System.out.println("Patient found by Gender:"+gender);
   patientDTO=patients[i];
f=true;
break;
     }
  }
}
else{
System.out.println("No Patient Found by Gender:"+gender);
}
return patientDTO;
}
}
public boolean updatePatientsContactNoById(int patientId,long contactNo){
boolean f=false;
PatientDTO patientDTO=null;
System.out.println("inside updatePatientsContactNoById()");
int i=0;
if(patients[i] i=null && contactNo > 0){
for(int i=0;i<patients.length;i++){
if(patients[i].getPatientId()==(patientId)){
System.out.println("Patient contactNo updated to:"+contactNo);
Patients[i].setPatientcontactNo(contactNo);
f=true;
}

else{
f=false;
	System.out.println("Patient Not Found");
}
return patientDTO;
}
}
public boolean deletePatientById(int id){
System.out.println("inside deletePatients method");
if(patientId>0){
	for(int i=0;i<patients.length;i++){
		if(patients[i].getPatientId()==patientId){
			System.out.println("patient is not deleted");
			PatientDTO = patients[i];
		}
	}
}
}
}
