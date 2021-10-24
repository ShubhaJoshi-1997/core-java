class JobUtil{

public static void main(String a[]){

JobDTO dto = new JobDTO();
dto.setType("Government");
dto.setDepartment("KVIB");
dto.setVacancies(100);
System.out.println(dto);

JobDTO dto1 = new JobDTO();
dto1.setType("Private");
dto1.setDepartment("IT company");
dto1.setVacancies(1000);
System.out.println(dto1);

JobDTO dto2 = new JobDTO();
dto2.setType("Government");
dto2.setDepartment("Police");
dto2.setVacancies(60);
System.out.println(dto2);


}
}