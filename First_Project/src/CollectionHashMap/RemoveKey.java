package CollectionHashMap;

import java.util.HashMap;
import java.util.Map;

public class RemoveKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m2=new HashMap<>();
		//HashMap<String,Integer> m2=new HashMap<>();
		m2.put("Atuk",1);
		m2.put("Ajay",2);
		m2.put("Akash",3);
		m2.put("Karan",4);
		
		System.out.println(m2);
		//System.out.println(m2.remove("Ajay"));
		System.out.println(m2);
		m2.remove("Karan");
for(String s:m2.keySet())
{
	System.out.println(s);
	
}
for(Map.Entry<String,Integer>  entry:m2.entrySet())
{
	System.out.println(entry.getValue());
	
}


	
	}

}
