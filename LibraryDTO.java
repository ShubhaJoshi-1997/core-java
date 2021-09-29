public class LibraryDTO{

public LibraryDTO(){
System.out.println("LibraryDTO object is created");

}
private String type;
private int noOfBooks;
private String location;



public String getType(){
	return type;
}
public void setType(String type){
	this.type=type;
}
public int getNoOfBooks(){
	return noOfBooks;
}
public void setNoOfBooks(int noOfBooks){
	this.noOfBooks=noOfBooks;
}
public String getLocation(){
	return location;
}
public void setLocation(String location){
	this.location=location;
}
}
