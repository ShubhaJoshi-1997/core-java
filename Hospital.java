class Hospital{

  public PatientDTO[]patients;
  private int index;

public Hospital(int size){
  patients=new PatientDTO[size];
}

public boolean createPatientDetails(PatientDTO patients){
boolean patientAdded=false;
System.out.println("inside createPatient()");
if(patients!=null){
  this.patients[index++]=patients;
  patientAdded=true;
}

else{
System.out.println("No Patient added");
return patientAdded=false;
}
return patientAdded;
}

public void getAllPatients(){
for(int i=0;i<patients.length;i++){
System.out.println(patients[i]);
}
}
}

