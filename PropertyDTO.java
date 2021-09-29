public class PropertyDTO{

public PropertyDTO(){
System.out.println("PropertyDTO object is created");

}
private String propertyType;
private int cost;
private String location;
private String propertyOwner;


public String getPropertyType(){
	return propertyType;
}
public void setPropertyType(String propertyType){
	this.propertyType=propertyType;
}
public int getCost(){
	return cost;
}
public void setCost(int cost){
	this.cost=cost;
}
public String getLocation(){
	return location;
}
public void setLocation(String location){
	this.location=location;
}

public String getPropertyOwner(){
	return propertyOwner;
}
public void setPropertyOwner(String propertyOwner){
	this.propertyOwner=propertyOwner;
}
}