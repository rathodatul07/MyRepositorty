package Collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorStringExamp {

	public void iterat()
	{
		ArrayList<String> l=new ArrayList<>();
		System.out.println(l);
		l.add("Hi");
		l.add("Hello");
		l.add("Welcome");
		l.add("Indiaa");
		l.add("Good");
		System.out.println(l);
		Iterator<String> itr=l.iterator();
		while(itr.hasNext())
		{
			String o=itr.next();
			int size=o.length();
			if(size>5)
			{
				itr.remove();
			}
			
		}
		
		System.out.println(l);
	}
	public static void main(String[] args)
	{
		IteratorStringExamp i=new IteratorStringExamp();
		i.iterat();
		

	}

}
