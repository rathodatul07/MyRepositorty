package Methods;

public class Book 
{
	int book_id;
	int book_page;
	String book_name;
	String book_auther;
	
public void acceptDetails(int id,int pages,String b_name,String a_name)
{
	book_id=id;
	book_page=pages;
	book_name=b_name;
	book_auther=a_name;
}
public void showDetail()
{
	System.out.println("book ID Is: "+book_id);
	System.out.println("book Page Is: "+book_page);
	System.out.println("book name Is: "+book_name);
	System.out.println("book auther name Is: "+book_auther);
}
}
class Library
{
	public void displayBook(Book obj)
	{
	System.out.println(obj.book_id);
	}
}