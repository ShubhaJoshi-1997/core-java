class GoldUtil{

public static void main(String a[]){
System.out.println("main method is started");

GoldDTO dto=new GoldDTO();
dto.setGoldId(1234);
dto.setShop("Tirumal shop");
dto.setAddress("Bagalkot near/bank");
dto.getDetailsofGold();

System.out.println(dto.hashCode());
System.out.println("main method is ended");
System.out.println("Default value of hashcode"+dto.hashCode());

//System.out.println(dto.getGoldId()+" "+dto.getShop()+" "+dto.getAddress());//
}
}
