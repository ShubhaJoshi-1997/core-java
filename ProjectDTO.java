public class ProjectDTO{

public void getDetailsofProject(){
System.out.println(getProjectDomain()+" "+getProjectName()+" "+getTeamates()+" "+getGuide()+" "+getTechnologyUsed());
}

private String projectDomain;
private String projectName;
private int teamates;
private String guide;
private String technologyUsed;



public String getProjectDomain(){
return projectDomain;
}

public void setProjectDomain(String projectDomain){
this.projectDomain=projectDomain;
}

public String getProjectName(){
return projectName;
}

public void setProjectName(String projectName){
this.projectName=projectName;
}

public int getTeamates(){
return teamates;
}
public void setTeamates(int teamates){
this.teamates=teamates;
}
public String getGuide(){
return guide;
}

public void setGuide(String guide){
this.guide=guide;
}
public String getTechnologyUsed(){
return technologyUsed;
}

public void setTechnologyUsed(String technologyUsed){
this.technologyUsed=technologyUsed;
}
public int hashCode(){
return teamates;
}
}


