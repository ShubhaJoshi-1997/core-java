class EceTester{

public static void main(String a[]){
Ece ece = new Ece();
ece.branchName = "Electronics and Communication";
ece.universityNo = "2LB16EC051";
ece.fees = 43000;
ece.noOfStudents = 80;
ece.collegeName = "BGMIT";
String problemSolver = ece.problemSolver();
System.out.println(problemSolver);
ece.displayDetails();
 }
}