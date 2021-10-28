import java.util.*;
class LibraryTester
{
	public static void main(String args[])
	{
		System.out.println("\n"+"Welcome to the City library");
		System.out.println("\n"+"Enter No of Books");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		Library lib=new Library(size);
		if(size>0)
		{
			for(int i=0;i<size;i++)
			{
				BookDTO book=new BookDTO();
				System.out.println("Enter the Books details");
				
				System.out.println("\n"+"Enter the book id ");
				int id=sc.nextInt();
				book.setBookId(id);
				
				System.out.println("Enter the book name");
				String name=sc.next();
				book.setBookName(name);
				
				System.out.println("Enter the Author name");
				String author=sc.next();
				book.setAuthorName(author);
				
				System.out.println("Enter the publisher name");
				String publisher=sc.next();
				book.setPublisher(publisher);
				
				System.out.println("Enter the Book price");
				double rs=sc.nextLong();
				book.setPrice(rs);
				
				System.out.println("Enter the No of pages");
				int pages=sc.nextInt();
				book.setNoOfPages(pages);
				
				System.out.println("Enter the Edition of book");
				int edition=sc.nextInt();
				book.setEdition(edition);
				
				boolean isSaved=lib.saveBooks(book);
				System.out.println(isSaved);
			}
			lib.getAllBooks();
			
			System.out.println("\n"+"Enter the book id to get Book details");
			int i=sc.nextInt();
			System.out.println(lib.getBookById(i));
			
			System.out.println("\n"+"Enter the author name to get Book name");
			String aut=sc.next();
			System.out.println(lib.getBookNameByAuthor(aut));
			
			System.out.println("\n"+"Enter the book name to publisher");
			String bo=sc.next();
			System.out.println(lib.getPublisherNameByBookName(bo));
			
			System.out.println("\n"+"Enter the book name to details");
			String na=sc.next();
			System.out.println(lib.getBookByName(na));
			
			System.out.println("\n"+"Enter the Price to get author name");
			double pri=sc.nextDouble();
			System.out.println(lib.getAuthorNameByPrice(pri));
			
			System.out.println("\n"+"Enter the Publisher to get edition of the book");
			String pub=sc.next();
			System.out.println(lib.getEditionByPublisherName(pub));
			
			System.out.println("\n"+"Enter Book id and Author Name to update");
			int id=sc.nextInt();
			String au=sc.next();
			lib.updateAuthorNameByBookId(au,id);
			
			lib.getAllBooks();
			
			System.out.println("\n"+"Enter book id to delete book");
			int id1=sc.nextInt();
			lib.deleteBookById(id1);
			
			lib.getAllBooks();
		}
		
	}
}