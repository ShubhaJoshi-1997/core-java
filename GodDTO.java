class GodDTO{

private String name;
private String location;
private int distance;

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
}

public String getLocation(){
return location;
}

public void setLocation(String location){
this.location=location;
}

public int getDitance(){
return distance;
}

public void setDistance(int distance){
this.distance = distance;
}

@Override
public String toString(){
	return "GodDTO - [name = "+this.name+" , location = "+this.location+" , distance = "+this.distance+"]";
}

}