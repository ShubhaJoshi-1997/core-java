class IcecreamUtil{

public static void main(String a[]){

IcecreamDTO dto = new IcecreamDTO();
dto.setFlavour("Chocolate");
dto.setColor("brown");
dto.setPrice(50);
System.out.println(dto);

IcecreamDTO dto1 = new IcecreamDTO();
dto1.setFlavour("Strawberry");
dto1.setColor("pink");
dto1.setPrice(30);
System.out.println(dto1);

IcecreamDTO dto2 = new IcecreamDTO();
dto2.setFlavour("vanilla");
dto2.setColor("yellow");
dto2.setPrice(60);
System.out.println(dto2);


}
}