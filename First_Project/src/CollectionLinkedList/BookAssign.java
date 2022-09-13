package CollectionLinkedList;

import java.util.Comparator;

public class BookAssign 
{
int b_id;
String b_name;
int b_price;
String b_Auther;
public BookAssign(int b_id, String b_name, int b_price, String b_Auther) {
	
	this.b_id = b_id;
	this.b_name = b_name;
	this.b_price = b_price;
	this.b_Auther = b_Auther;
}

public String toString()
{
	return "\nb_id: "+b_id+"\nb_name:"+b_name+"\nb_price: "+b_price+"\nb_Auther: "+b_Auther;
}

}
class Comparatorid implements Comparator<BookAssign>
{
	public int compare(BookAssign b1,BookAssign b2)
	{
		return b2.b_id-b1.b_id;
	}
}