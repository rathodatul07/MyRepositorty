package CollectionAssignment;

import java.security.Identity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;

import Collection1.Customer;

public class IteratorExam {

	public static void main(String[] args) 
	{
		/*//IdentityHashMap
		 * IdentityHashMap h=new IdentityHashMap(); Integer i1=new Integer(10); Integer
		 * i2=new Integer(10); System.out.println(i1); System.out.println(i2); h.put(i1,
		 * "Ajay"); h.put(i2, "Atul"); System.out.println(h);
		 * System.out.println(i1.equals(i2));
		 */	
		ArrayList l=new ArrayList<Customer>();
		l.add("Akas");
		l.add("Ajay");
		l.add("Nag");
		l.add("Chaitu");

		System.out.println(l);
		Iterator itr=l.iterator();

		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			String s=(String) itr.next();
			
			if(s.equals("Akash"))
			{
				
				System.out.println();
			}
			
		}

	}
}