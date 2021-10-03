class MechanicalTester{

public static void main(String a[]){
Mechanical mechanical = new Mechanical();
mechanical.branchName = "Mechanical Engineering";
mechanical.universityNo = "2PE16ME001";
mechanical.fees = 54000;
mechanical.noOfStudents = 100;
mechanical.collegeName = "PESIT";
String problemSolver = mechanical.problemSolver();
System.out.println(problemSolver);
mechanical.displayDetails();
 }
}