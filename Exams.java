class  Exams{
public String universityName;
public int fees;




public Exams(String universityName,int fees){
System.out.println("Exam object is created");
this.universityName = universityName;
this.fees = fees;
System.out.println(universityName + " " + fees);
}

public static void main(String a[]){
Exams exams = new Exams("VTU",1350);
Exams exams1 = new Exams("RCU",2000);
Exams exams2 = new Exams("KUD",5000);
}



}


