package com.Xworkz.collectionapp;

public class RouterDTO {

private int routerid;
private String name;
private String color;
private int price;


public int RouterId(){
return routerid;
}

public void setRouterId(int routerid){
this.routerid=routerid;
}

public String getName(){
return name;
}

public void setName(String name){
this.name=name;
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
return "RouterDTO - [routerid="+this.routerid+",name="+this.name+",color="+this.color+",price="+this.price+"]";
}
}


