public class GoldDTO{

public GoldDTO(){
System.out.println("GoldDTO object is created");

}
private String shopName;
private int cost;
private String location;
private String owner;
private String color;


public String getShopName(){
	return shopName;
}
public void setShopName(String shopName){
	this.shopName=shopName;
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

public String getOwner(){
	return owner;
}
public void setOwner(String owner){
	this.owner=owner;
}
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color=color;
}
}
