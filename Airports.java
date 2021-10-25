class  Airport{

public int airportId;
public String airportName;
public String airportLocation;
public Terminal terminals;//class type having a referenc of another class(has a relation)


public Airport (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setAirportId(int airportId){
	this.airportId = airportId;
}

public void setAirportName(String airportName){
	this.airportName = airportName;
}
public void setAirportLocation(String airportLocation){
	this.airportLocation = airportLocation;
}
public void setTerminals(Terminal terminals){
	this.terminals = terminals;
}
@Override
public String toString(){
	return "Airport - [airportId = "+this.airportId+" , AirportName= "+this.airportName+" , AirportLocation= "+this.airportLocation+" Terminal="+this.terminals+"]";
}
}