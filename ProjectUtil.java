class ProjectUtil{

public static void main(String a[]){

ProjectDTO dto = new ProjectDTO();
 dto.setProjectTitle("Automated Sanitizing Robot");
 dto.setFees(8000);
 dto.setProjectGuide("Sneha Kotin");
 dto.setTeamMembers("Shubha , Bismilla , Deepa");
 
 System.out.println(dto.getProjectTitle()+" "+dto.getFees()+" "+dto.getProjectGuide()+" "+dto.getTeamMembers());
 }
 }
 