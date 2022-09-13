package CollectionHashMap;

import java.util.HashMap;

public class EmptyOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m2=new HashMap<>();
		//HashMap<String,Integer> m2=new HashMap<>();
		m2.put("Atuk",1);
		m2.put("Ajay",2);
		m2.put("Akash",3);
		m2.put("Karan",4);
		m2.put(null,4);
		
System.out.println(m2.isEmpty());

if(m2.isEmpty())
{
	System.out.println("it is empty"+m2.size());
}
else
{
	System.out.println("not empty:"+m2.size());
}

	}

}
