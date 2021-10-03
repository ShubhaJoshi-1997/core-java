class EeeTester{

public static void main(String a[]){
Eee eee = new Eee();
eee.branchName = "Electrical and Electronics";
eee.universityNo = "2MS16EE003";
eee.fees = 56000;
eee.noOfStudents = 200;
eee.collegeName = "MSRIT";
String problemSolver = eee.problemSolver();
System.out.println(problemSolver);
eee.displayDetails();
 }
}