class CseTester{

public static void main(String a[]){
Cse cse = new Cse();
cse.branchName = "Computer Science";
cse.universityNo = "2JN16CS051";
cse.fees = 34000;
cse.noOfStudents = 100;
cse.collegeName = "JNIT";
String problemSolver = cse.problemSolver();
System.out.println(problemSolver);
cse.displayDetails();
 }
}