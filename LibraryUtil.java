class LibraryUtil{

public static void main(String a[]){

LibraryDTO dto = new LibraryDTO();
 dto.setType("Public Library");
 dto.setNoOfBooks(30000);
 dto.setLocation("Rajajinagar");
 
 
 System.out.println(dto.getType() +" "+ dto.getNoOfBooks()+" "+ dto.getLocation());
 }
 }
 