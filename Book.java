class  Book{

public int bookId;
public String bookName;
public int bookPrice;
public Page pages;


public Book (){
	System.out.println(this.getClass().getSimpleName() +"Objects are created");
}

public void setBookId(int bookId){
	this.bookId = bookId;
}

public void setBookName(String BookName){
	this.bookName = bookName;
}
public void setBookPrice(int bookPrice){
	this.bookPrice = bookPrice;
}
public void setPages(Page pages){
	this.pages = pages;
}
@Override
public String toString(){
	return "Book - [BookId = "+this.bookId+" , BookName= "+this.bookName+" , BookPrice= "+this.bookPrice+" Page ="+this.pages+"]";
}
}