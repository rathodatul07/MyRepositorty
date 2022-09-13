package CollectionHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetOnlyValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Ajay";
		HashMap<String,Integer> m2=new HashMap<>();
		m2.put("Atuk",1);
		m2.put("Ajay",2);
		m2.put("Akash",3);
		m2.put("Karan",4);
		m2.put(null,4);
		//Iterator<String> itr=m2.keySet().iterator();
		for(Map.Entry<String,Integer>  entry:m2.entrySet())
		{
			System.out.println(entry.getValue());
			
		}
		System.out.println(m2.containsKey("Akash"));
		
	}

}
