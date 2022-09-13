package CollectionHashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapExample 
{
	HashMap<Integer, Float> mp=new HashMap<>();
	
	
	Collection<Float> c=mp.values();
	
	public void prepareMap()
	{
		mp.put(101, 50.98f);
		mp.put(102, 60.98f); 
		mp.put(103, 70.98f);
		mp.put(104, 80.98f);
		mp.put(105, 98.98f);
		mp.put(106, 76.98f);
		  
		
		Set<Integer> set=mp.keySet();//entry set
		Set set1=mp.entrySet();
		Set set2=mp.keySet();//key set
		Collection set3=mp.values();
		System.out.println("values::"+set3);
		System.out.println("entry set"+set);
		System.out.println("key Set"+set2);
		mp.remove(105);
		
		System.out.println("after removing 105 key");
		System.out.println(mp);
		System.out.println("to check 101 key is available or not: "+mp.containsKey(101));
		System.out.println("80.98 value is available or not: "+mp.containsValue(80.98f));
		System.out.println(mp.remove(106, 76.98f));
		System.out.println(mp);
		System.out.println("Entry set...");
		
		
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext())
		{
			Integer key=itr.next();
			System.out.println("key:"+key);
			//System.out.println("value of key:"+mp.get(key));
		} 	
		
	}

	public static void main(String[] args) {
		

HashMapExample h=new HashMapExample();
h.prepareMap();

	}

}
