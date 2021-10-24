class StateUtil{

public static void main(String a[]){

StateDTO dto = new StateDTO();
dto.setName("Karnataka");
dto.setLanguage("Kannada");
dto.setPopulation(120000);
System.out.println(dto);

StateDTO dto1 = new StateDTO();
dto1.setName("Maharashtra");
dto1.setLanguage("Marathi");
dto1.setPopulation(200500);
System.out.println(dto1);

StateDTO dto2 = new StateDTO();
dto2.setName("Andhra Pradesh");
dto2.setLanguage("Telugu");
dto2.setPopulation(160500);
System.out.println(dto2);


}
}