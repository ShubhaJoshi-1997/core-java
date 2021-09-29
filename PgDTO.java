public class PgDTO{

public PgDTO(){
System.out.println("PgDTO object is created");

}
private String pgName;
private String wardenName;
private int fees;
private String location; 




public String getPgName(){
	return pgName;
}
public void setPgName(String pgName){
	this.pgName=pgName;
}
public String getWardenName(){
	return wardenName;
}
public void setWardenName(String wardenName){
	this.wardenName=wardenName;
}
public int getFees(){
	return fees;
}
public void setFees(int fees){
	this.fees=fees;
}
public String getLocation(){
	return location;
}
public void setLocation(String location){
	this.location=location;
}
}