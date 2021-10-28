class Library
{
	public BookDTO[] books;
	private int index;
	public static int s=0;
	
	public Library(int size)
	{
		books = new BookDTO[size];
	}
	
	public boolean saveBooks(BookDTO books)
	{
		boolean bookSaved=false;
		System.out.println("Inside save book method");
		if(books != null)
		{
			this.books[index++]=books;
			bookSaved=true;
		}
		else
		{
			System.out.println("No books saved");
			return bookSaved=false;
		}
		return bookSaved;
	}
	
	public void getAllBooks()
	{
		for(int i=0; i<books.length-s; i++)
		{
			System.out.println(books[i]);
		}
	}
	
	public BookDTO getBookById(int id)
	{
		boolean f=false;
		BookDTO bookDTO=null;
		System.out.println("Inside Get book by id method");
		if(id != 0)
		{
			for(int i=0;i<books.length; i++)
			{
				if(books[i].getBookId()==(id))
				{
					System.out.println("Book found by id : "+id);
					bookDTO =books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Book not found");
			}
		}
		return bookDTO;
	}
	
	public String getBookNameByAuthor(String author)
	{
		boolean f=false;
		System.out.println("Inside Get book name by author method");
		String bookName=null;
		if(author != null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getAuthorName().equals(author))
				{
					bookName=books[i].getBookName();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Book not found");
			}
			else
			{
				System.out.println("Book Founded");
			}
		}
		return bookName;
	}
	
	public String getPublisherNameByBookName(String bookName)
	{
		boolean f=false;
		System.out.println("Inside Get publisher name by book name method");
		String publisher=null;
		if(bookName != null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookName().equals(bookName))
				{
					publisher=books[i].getPublisher();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Publisher not found");
			}
			else
			{
				System.out.println("Publisher Founded");
			}
		}
		return publisher;
	}
	
	public BookDTO getBookByName(String name)
	{
		boolean f=false;
		BookDTO bookDTO=null;
		System.out.println("Inside book by name method");
		if(name!= null)
		{
			for(int i=0;i<books.length; i++)
			{
				if(books[i].getBookName().equals(name))
				{
					System.out.println("Book found by name : "+name);
					bookDTO =books[i];
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Book not found");
			}
		}
		return bookDTO;
	}
	
	public String getAuthorNameByPrice(double price)
	{
		boolean f=false;
		System.out.println("Inside Get author name by price method");
		String authorName=null;
		if(price != 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getPrice()==(price))
				{
					authorName=books[i].getAuthorName();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Author not found");
			}
			else
			{
				System.out.println("Author Founded");
			}
		}
		return authorName;
	}
	
	public int getEditionByPublisherName(String publisher)
	{
		boolean f=false;
		System.out.println("Inside Get edition by publisher name method");
		int edition=0;
		if(publisher != null)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getPublisher().equals(publisher))
				{
					edition=books[i].getEdition();
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Book Edition not found");
			}
		}
		return edition;
	}
	
	public boolean updateAuthorNameByBookId(String authorName, int bookId)
	{
		boolean f=false;
		BookDTO bookDTO=null;
		System.out.println("Inside update author name by book id method");
		if(authorName!=null && bookId>0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookId()==(bookId))
				{
					System.out.println("Author name updated by : "+authorName);
					books[i].setAuthorName(authorName);
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(f==false)
			{
				System.out.println("Author name is not updated");
			}
		}
		return f;
	}
	
	public boolean deleteBookById(int id)
	{
		boolean f=false;
		int y=0;
		BookDTO bookDTO=null;
		System.out.println("Inside delete Book method");
		if(id > 0)
		{
			for(int i=0; i<books.length; i++)
			{
				if(books[i].getBookId()==(id))
				{
					System.out.println("Book deleted by id : "+id);
					y=i;
					s=s+1;
					f=true;
					break;
				}
				else
				{
					f=false;
				}
			}
			if(y!=-1)
			{
				for(int i=y;i<books.length-1;i++)
				{
					books[i]=books[i+1];
				}
			}
		}
		if(f==false)
		{
			System.out.println("Book is not deleted");
		}
		
		return f;
	}
}

