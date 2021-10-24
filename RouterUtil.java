class RouterUtil{

public static void main(String a[]){

RouterDTO dto = new RouterDTO();
dto.setRouterId(456);
dto.setName("tp-link");
dto.setColor("white");
dto.setPrice(850);
System.out.println(dto);

RouterDTO dto1 = new RouterDTO();
dto1.setRouterId(461);
dto1.setName("jio fiber");
dto1.setColor("black&white");
dto1.setPrice(900);
System.out.println(dto1);//implicit call



RouterDTO dto2= new RouterDTO();
dto2.setRouterId(443);
dto2.setName("Airtel");
dto2.setColor("black");
dto2.setPrice(700);
System.out.println(dto2);

System.out.println("toString method used "+dto.toString());//explicit call
System.out.println("toString method used "+dto1.toString());
System.out.println("toString method used "+dto2.toString());

}
}

