package Collection1;

import java.util.*;

public class RemoveDuplicateFromLIst {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
al.add("ob1");
al.add(null);
al.add("ob1");
al.add("ob2");
al.add("ob1");
al.add(null);
al.add("ob4");
System.out.println(al);

//ArrayList al1=new ArrayList(new HashSet(al));
HashSet al1=new HashSet(al);
System.out.println(al1);
Iterator itr=al1.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
