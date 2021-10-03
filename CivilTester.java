class CivilTester{

public static void main(String a[]){
Civil civil = new Civil();
civil.branchName = "Civil Engineering";
civil.universityNo = "2RN16CV032";
civil.fees = 62000;
civil.noOfStudents = 120;
civil.collegeName = "RNIT";
String problemSolver = civil.problemSolver();
System.out.println(problemSolver);
civil.displayDetails();
 }
}