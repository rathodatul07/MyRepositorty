package CollectionHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WithGenerics {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> mp=new HashMap();
		mp.put(2, "Akash");
		mp.put(3, "Ashwin");
		mp.put(5, "Rjaesh");
		mp.put(4, "Prathmesh");
		mp.put(3, "Aytul");
//		System.out.println(mp);
		
	Iterator itr=	mp.entrySet().iterator();
	while(itr.hasNext())
	{
		
		Map.Entry m=(Map.Entry)itr.next();
		
		System.out.println(m.getKey()+" _"+m.getValue());
		System.out.println(m.setValue("Prathmesh"));
	}
		}
}
