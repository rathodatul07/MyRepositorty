package CollectionHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class IterateGetEntries
{
	
	HashMap<Integer, String> mp=new HashMap<>();
	HashMap<Integer, String> mp1=new HashMap<>();

public void prepareHashMap()
{
	
	
      mp.put(1, "Atul");
      mp.put(2, "Ajay");
      mp.put(3, "Akash");
      mp.put(4, "Atul");
    
      System.out.println(mp);
      Set<Integer> set=mp.keySet();
     /* LinkedHashSet set2=new LinkedHashSet();//insertion order,index not allows
      set2.add(10);
      set2.add(10);
      set2.add(20);
      set2.add(40);
      set2.add(20);
      //System.out.println(set2);
      ArrayList as=new ArrayList(set2);
      System.out.println(as.indexOf(10));
      */
      /*   HashSet<Integer> set3=new HashSet<>();
      set3.add(17);
      set3.add(16);
      set3.add(10);
      set3.add(32);
      set3.add(34);
      System.out.println(set3);
      */
      
      
      
		Iterator<Integer> itr=set.iterator();
		for(int i=0;i<mp.size();i++)
		{
			Integer key=itr.next();
			
			System.out.println(mp.get(key));//get keys using get
		}
		
		mp1=mp;
		System.out.println(mp.isEmpty());//to check hashmap is empty or not//Q:9
		
		
	//	System.out.println(mp.get(key));
}
	public static void main(String[] args) 
	{
		IterateGetEntries i=new IterateGetEntries()	;
		i.prepareHashMap();

	}

}
