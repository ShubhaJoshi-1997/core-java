class  Laptop{

public int laptopId;
public String laptopName;
public int laptopPrice;
public Harddisk harddisks;//class type having a referenc of another class(has a relation)


public Laptop (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setLaptopId(int laptopId){
	this.laptopId = laptopId;
}

public void setLaptopName(String laptopName){
	this.laptopName = laptopName;
}
public void setLaptopPrice(int laptopPrice){
	this.laptopPrice = laptopPrice;
}
public void setHarddisks(Harddisk harddisks){
	this.harddisks = harddisks;
}
@Override
public String toString(){
	return "Laptop - [laptopId = "+this.laptopId+" , LaptopName= "+this.laptopName+" , LaptopPrice= "+this.laptopPrice+" Harddisk="+this.harddisks+"]";
}
}