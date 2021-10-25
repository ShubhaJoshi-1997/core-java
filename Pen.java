class  Pen{

public int penId;
public String penName;
public int penPrice;
public Refill refills;//class type having a referenc of another class(has a relation)


public Pen (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setPenId(int penId){
	this.penId = penId;
}

public void setPenName(String PenName){
	this.penName = penName;
}
public void setPenPrice(int penPrice){
	this.penPrice = penPrice;
}
public void setRefills(Refill refills){
	this.refills = refills;
}
@Override
public String toString(){
	return "Pen - [PenId = "+this.penId+" , PenName= "+this.penName+" , PenPrice= "+this.penPrice+" Refill="+this.refills+"]";
}
}