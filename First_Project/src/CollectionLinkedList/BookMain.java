package CollectionLinkedList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookAssign b1=new BookAssign(103,"Brainly",4000,"A.R.Readyy");
		BookAssign b2=new BookAssign(101,"Nobel",6000,"B.T.Sharma");
		BookAssign b3=new BookAssign(102,"Confident",8000,"c.R.Mehta");
		//System.out.println(b1);
		
		TreeMap<BookAssign,Integer> tr=new TreeMap<BookAssign,Integer>(new Comparatorid());
		tr.put(b1, 3);
		tr.put(b2, 2);
		tr.put(b3, 1);
		//System.out.println("decending order in tree map:"+tr);
		for(Map.Entry<BookAssign, Integer> entry:tr.entrySet())
		{
			System.out.println("Key:"+entry.getKey()+"Values:"+entry.getValue());
		}
		HashMap<Integer,String> map=new LinkedHashMap<>();
		map.put(2, "Two");
		map.put(1, "one ");
		map.put(4, "Four");
		map.put(6, "Six");	
		System.out.println("According to insertion Order using linkedHashMap:");
		for(Map.Entry<Integer,String>entry:map.entrySet())
		{
			System.out.println("Key :"+entry.getKey()+" values :"+entry.getValue());	
		}
	}
}
