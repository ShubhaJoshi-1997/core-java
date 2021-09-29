class LicenseUtil{

public static void main(String a[]){

LicenseDTO dto = new LicenseDTO();
 dto.setName("Shubha J");
 dto.setLicenseNo("DL012345678");
 dto.setValidity(10);
 
 
 System.out.println(dto.getName() +" "+ dto.getLicenseNo()+" "+ dto.getValidity());
 }
 }
 