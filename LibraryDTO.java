 class LibraryDTO{
public void getDetailsofLibrary(){
System.out.println(getLibraryId()+" "+getLibraryName()+" "+getBook()+" "+getAddress()); 

}

private int libraryId;
private String libraryName;
private String book;
private String address;

public int getLibraryId(){
return libraryId;
}

public void setLibraryId(int libraryId){
this.libraryId=libraryId;
}

public String getLibraryName(){
return libraryName;
}

public void setLibraryName(String libraryName){
this.libraryName=libraryName;
}

public String getBook(){
return book;
}
public void setBook(String book){
this.book=book;
}
public String getAddress(){
return address;
}

public void setAddress(String address){
this.address=address;
}

public int hashCode(){
return libraryId;
}
}





