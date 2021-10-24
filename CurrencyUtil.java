class CurrencyUtil{

public static void main(String a[]){

CurrencyDTO dto = new CurrencyDTO();
dto.setName("Rupee");
dto.setCountry("India");
System.out.println(dto);

CurrencyDTO dto1 = new CurrencyDTO();
dto1.setName("Dollars");
dto1.setCountry("Australia");
System.out.println(dto1);

CurrencyDTO dto2 = new CurrencyDTO();
dto2.setName("taka");
dto2.setCountry("Bangladesh");
System.out.println(dto2);


}
}
