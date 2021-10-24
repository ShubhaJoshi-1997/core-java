public class DrivingLicenceDTO{

	public DrivingLicenceDTO(){
		System.out.println("Driving Licence object is created");
	}
	
	private String name;
	private String dlNo;
	private String state;
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDlNo(){
		return dlNo;
	}
	
	public void setDlNo(String dlNo){
		this.dlNo = dlNo;
	}
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
}
	