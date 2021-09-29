public class LicDTO{

public LicDTO(){
System.out.println("LicDTO object is created");

}
private String customerName;
private int policyId;
private int years;



public String getCustomerName(){
	return customerName;
}
public void setCustomerName(String customerName){
	this.customerName=customerName;
}
public int getPolicyId(){
	return policyId;
}
public void setPolicyId(int policyId){
	this.policyId=policyId;
}
public int getYears(){
	return years;
}
public void setYears(int years){
	this.years=years;
}
}
