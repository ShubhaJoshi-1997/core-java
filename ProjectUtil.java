class ProjectUtil{

public static void main(String a[]){
System.out.println("Main method started");

ProjectDTO dto=new ProjectDTO();
dto.setProjectDomain("Machine learning");
dto.setProjectName("Driver-Drowsiness Detection");
dto.setTeamates(4);
dto.setGuide("Prof:-Tej C Hiremath");
dto.setTechnologyUsed("OpenCV");
dto.getDetailsofProject();
System.out.println(dto.hashCode());
System.out.println("main method ended");
System.out.println("Default value of hashCode"+dto.hashCode());

}
}

