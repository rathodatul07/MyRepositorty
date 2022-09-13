package Collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class ArrayExample 
{
public void reverce(ArrayList<String> l)
{ 
	for(int i=l.size()-1;i>=0;i--)
 	{
		System.out.println(l.get(i));
	}
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	ArrayExample a=new ArrayExample();
		ArrayList<String> l=new ArrayList<>();
		l.add("at");
		l.add("hEllo");
		l.add("ajay");
		l.add("world");
		l.add("pune");
		l.add(1, "my world");
		l.set(2, "akash");
		Collections.sort(l);	
	//	l.add(null);
		//System.out.println(l.remove(2));
		System.out.println(l);
		//Object[] a4=l.toArray();
		//System.out.println(a4);
		
	
	}

}
