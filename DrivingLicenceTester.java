class DrivingLicenceTester{

	public static void main(String args[]){
	
	DrivingLicenceDTO dto = new DrivingLicenceDTO();
	
	dto.setName ("Shubha Joshi");
	dto.setDlNo ("KA29 20201800322");
	dto.setState("Karanataka");
	
	System.out.println("NAME: "+dto.getName()+"\n"+"Dl No:"+dto.getDlNo()+"\n"+"STATE:"+dto.getState()+"\n");
	}
}