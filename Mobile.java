class  Mobile{

public int mobileId;
public String mobileName;
public int mobilePrice;
public Sim sims;


public Mobile (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setMobileId(int mobileId){
	this.mobileId = mobileId;
}

public void setMobileName(String MobileName){
	this.mobileName = mobileName;
}
public void setMobilePrice(int mobilePrice){
	this.mobilePrice = mobilePrice;
}
public void setSims(Sim sims){
	this.sims = sims;
}
@Override
public String toString(){
	return "Mobile - [MobileId = "+this.mobileId+" , MobileName= "+this.mobileName+" , MobilePrice= "+this.mobilePrice+" Sim="+this.sims+"]";
}
}