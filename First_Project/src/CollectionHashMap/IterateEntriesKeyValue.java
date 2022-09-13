package CollectionHashMap;

import java.util.HashMap;
import java.util.Iterator;

public class IterateEntriesKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m2=new HashMap<>();
		m2.put("Atuk",1);
		m2.put("Ajay",2);
		m2.put("Akash",3);
		m2.put("Karan",4);
		
		Iterator<String> itr=m2.keySet().iterator();
		while(itr.hasNext())
		{
			String key=itr.next();
			System.out.println(key+" "+m2.get(key));
		}
	}

}
