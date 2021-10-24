class JobDTO{

private String type;
private String department;
private int vacancies;

public String getType(){
return type;
}

public void setType(String type){
this.type=type;
}

public String getDepartment(){
return department;
}

public void setDepartment(String department){
this.department=department;
}

public int getVacancies(){
return vacancies;
}

public void setVacancies(int vacancies){
this.vacancies = vacancies;
}

@Override
public String toString(){
	return "StateDTO - [type = "+this.type+" , department = "+this.department+" , vacancies = "+this.vacancies+"]";
}

}