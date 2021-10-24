class GoldDTO{

public void getDetailsofGold(){
System.out.println(getGoldId()+" "+getShop()+" "+getAddress());
}

private int goldId;
private String shop;
private String address;


public long getGoldId(){
return goldId;
}

public void setGoldId(int goldId){
this.goldId=goldId;
}
public String getShop(){
return shop;
}

public void setShop(String shop){
this.shop=shop;
}

public String getAddress(){
return address;
}

public void setAddress(String address){
this.address=address;
}
@Override

public int hashCode(){
return goldId;
}
}



