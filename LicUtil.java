class LicUtil{

public static void main(String a[]){

LicDTO dto = new LicDTO();
 dto.setCustomerName("Varsha");
 dto.setPolicyId(12345);
 dto.setYears(5);
 
 
 System.out.println(dto.getCustomerName() +" "+ dto.getPolicyId()+" "+ dto.getYears());
 }
 }
 