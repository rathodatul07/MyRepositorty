package CollectionSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIteartor {

	public void prepareSet()
	{
		TreeSet<Integer> ts=new TreeSet<>(Collections.reverseOrder());
		ts.add(10);
		ts.add(20);
		ts.add(50);
		ts.add(40);
		ts.add(30);
		
Iterator itr=ts.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}

	}
	public static void main(String[] args) {
		TreeSetIteartor t=new TreeSetIteartor();
		t.prepareSet();
	}
	
}
