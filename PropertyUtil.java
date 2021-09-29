class PropertyUtil{

public static void main(String a[]){

PropertyDTO dto = new PropertyDTO();
 dto.setPropertyType("Home");
 dto.setCost(2000000);
 dto.setLocation("Gaddankeri");
 dto.setPropertyOwner("Shrikant Joshi");
 
 System.out.println(dto.getPropertyType()+" "+dto.getCost()+" "+dto.getLocation()+" "+dto.getPropertyOwner());
 }
 }
 