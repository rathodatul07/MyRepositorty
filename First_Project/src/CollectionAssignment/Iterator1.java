package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

import Collection1.Customer;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList<Customer>();

		for(int i=0;i<=10;i++)
		{
			a.add(i);
		}
		System.out.println(a);
		Iterator itr=a.iterator();

		while(itr.hasNext())
		{
			//System.out.println(itr.next());
		Integer i=(Integer)itr.next();
		if(i%2!=0)
		{
			System.out.println(i);
		}
		else
		{
			itr.remove();
		}
		
		}
	}

}
