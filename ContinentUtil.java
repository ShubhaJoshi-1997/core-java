class ContinentUtil{

public static void main(String a[]){

ContinentDTO dto = new ContinentDTO();
dto.setName("Asia");
dto.setCountries(48);
dto.setPopulation(273523);
System.out.println(dto);

ContinentDTO dto1 = new ContinentDTO();
dto1.setName("Africa");
dto1.setCountries(54);
dto1.setPopulation(762800);
System.out.println(dto1);

ContinentDTO dto2 = new ContinentDTO();
dto2.setName("Australia");
dto2.setCountries(14);
dto2.setPopulation(605400);
System.out.println(dto2);


}
}
