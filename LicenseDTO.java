public class LicenseDTO{

public LicenseDTO(){
System.out.println("LicenseDTO object is created");

}
private String name;
private String licenseNo;
private int validity;




public String getName(){
	return name;
}
public void setName(String name){
	this.name=name;
}
public String getLicenseNo(){
	return licenseNo;
}
public void setLicenseNo(String licenseNo){
	this.licenseNo=licenseNo;
}
public int getValidity(){
	return validity;
}
public void setValidity(int validity){
	this.validity=validity;
}
}