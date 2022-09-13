package Methods;

public class BookMain {

	public static void main(String[] args) 
	{
		Book b=new Book();
		b.acceptDetails(1, 20000, "Horarsss", "Devendra");
		b.showDetail();
		System.out.println(".................b to b1......................................");
		Book b1=new Book();
		b1.book_id=b.book_id;
		b1.book_page=b.book_page;
		b1.book_name=b.book_name;
		b1.book_auther=b.book_auther;
		b1.showDetail();
		System.out.println("...........b1 to b3.....................");
		Book b3=new Book();
		
		b3=b1;
		b3.showDetail();
		System.out.println("Hashcode of b1 is: "+b1.hashCode());
		System.out.println("Hashcode of b3 is: "+b3.hashCode());
		System.out.println("Hashcode of b is: "+b.hashCode());
		System.out.println();
	}

}
