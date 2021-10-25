class BookTester{
public static void main(String a[]){

Book book = new Book();
book.setBookId(0311);
book.setBookName("Madhuri");
book.setBookPrice(25);

Page page = new Page();
page.pageType ="Ruled";
page.numberOfPages =50;

book.setPages(page);
System.out.println(book);
}
}