public class BookDTO
{
	public BookDTO()
	{
		System.out.println("\n"+this.getClass().getSimpleName()+" object is created");
	}
	
	private int bookId;
	private String bookName;
	private String authorName;
	private String publisher;
	private double price;
	private int noOfPages;
	private int edition;
	
	public int getBookId()
	{
		return bookId;
	}
	public void setBookId(int bookId)
	{
		this.bookId=bookId;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	public void setBookName(String bookName)
	{
		this.bookName=bookName;
	}
	
	public String getAuthorName()
	{
		return authorName;
	}
	public void setAuthorName(String authorName)
	{
		this.authorName=authorName;
	}
	
	public String getPublisher()
	{
		return publisher;
	}
	public void setPublisher(String publisher)
	{
		this.publisher=publisher;
	}
	
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public int getNoOfPages()
	{
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages)
	{
		this.noOfPages=noOfPages;
	}
	
	public int getEdition()
	{
		return edition;
	}
	public void setEdition(int edition)
	{
		this.edition=edition;
	}
	
	@Override
	public String toString()
	{
		return "\nbookDTO-{\nBook ID = "+this.bookId+"\nBook Name = "+this.bookName+"\nAuthor Name = "+this.authorName+"\nPublisher = "+this.publisher+"\nPrice = "+this.price+"\nNo of Pages = "+this.noOfPages+"\nEdition = "+this.edition+"\n}";
	}
	}