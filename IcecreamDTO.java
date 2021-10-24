class IcecreamDTO{


private String flavour;
private String color;
private int price;


public String getFlavour(){
return flavour;
}

public void setFlavour(String flavour){
this.flavour=flavour;
}

public String getColor(){
return color;
}
public void setColor(String color){
this.color=color;
}

public int getPrice(){
return price;
}
public void setPrice(int price){
this.price=price;
}


@Override
public String toString(){
return "RouterDTO - [flavour = "+this.flavour+" , color="+this.color+" , price="+this.price+"]";
}
}