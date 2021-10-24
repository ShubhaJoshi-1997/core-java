class LibraryUtil{

public static void main(String a[]){
System.out.println("main method started");

LibraryDTO dto=new LibraryDTO();
dto.setLibraryId(1234);
dto.setLibraryName("Ranna Grantalaya");
dto.setBook("padmaraddy");
dto.setAddress("Bagalkot");
dto.getDetailsofLibrary();
System.out.println(dto.hashCode());
System.out.println("main method is ended");
System.out.println("Default value of hashCode"+dto.hashCode());
}
}
