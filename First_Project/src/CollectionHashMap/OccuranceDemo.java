package CollectionHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class OccuranceDemo 
{
	HashMap<String,Integer> map;

	public void OccuranceOfHasMap(ArrayList<String> al)
	{
		map=new HashMap<>();
		
		Iterator<String> itr=al.iterator();	
		
		/*while(itr.hasNext())  //second way we have find occurance
		{
			String o=itr.next();
			Integer val=map.getOrDefault(o, 0);
			map.put(o,val+1 );
		}*/
		String o=itr.next();
		map.put(o, 2);
		System.out.println(map);
		while(itr.hasNext()) 
		{
			
			if(map.containsKey(o))
			{
				int val=map.get(o);
				map.put(o, val+1);
			}
			else
			{
				map.put(o, 1);
			}
		}
		
		System.out.println(map);
	}
	public static void main(String[] args) 
	{
 
		ArrayList<String> al=new ArrayList<>();
		al.add("HeadPhone");
		al.add("Mobile");
		al.add("BSpeaker");
		al.add("HeadPhone");
		al.add("BSpeaker");
		System.out.println(al);
		OccuranceDemo f=new OccuranceDemo();
		f.OccuranceOfHasMap(al);
	}

}
