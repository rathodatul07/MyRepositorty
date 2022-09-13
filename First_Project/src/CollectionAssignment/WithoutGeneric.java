package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

public class WithoutGeneric {
public void usingIterator(ArrayList a)
{
	Iterator<Integer> itr=a.iterator();
	System.err.println(itr);
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}

}
	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(50);
		a.add(40);
		a.add("AZtuk");
		a.add("lkk");
		System.out.println(a);
		/*
		 * ArrayList<Integer> a1=new ArrayList<>(); a1.add(1); a1.add(2); a1.add(3);
		 */
		WithoutGeneric w=new WithoutGeneric();
		w.usingIterator(a);
		
		
		
	}

}
