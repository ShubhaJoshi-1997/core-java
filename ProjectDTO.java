public class ProjectDTO{

public ProjectDTO(){
System.out.println("ProjectDTO object is created");

}
private String projectTitle;
private int fees;
private String teamMembers;
private String projectGuide;


public String getProjectTitle(){
	return projectTitle;
}
public void setProjectTitle(String projectTitle){
	this.projectTitle=projectTitle;
}
public int getFees(){
	return fees;
}
public void setFees(int fees){
	this.fees=fees;
}
public String getTeamMembers(){
	return teamMembers;
}
public void setTeamMembers(String teamMembers){
	this.teamMembers=teamMembers;
}

public String getProjectGuide(){
	return projectGuide;
}
public void setProjectGuide(String projectGuide){
	this.projectGuide=projectGuide;
}
}