package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample
{
	public void showList()
	{
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		
		System.out.println(l);
		
		for(Iterator<Integer> itr=l.iterator();itr.hasNext();)
		{
			Integer o=itr.next();
			System.out.println(o);
		}
		
		
	}

	public static void main(String[] args)
	{
		System.out.println("hii");
		IteratorExample i=new IteratorExample();
		
		//i.showList();
	}

}
