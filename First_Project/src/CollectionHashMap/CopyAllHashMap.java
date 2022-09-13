package CollectionHashMap;

import java.util.HashMap;

public class CopyAllHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> m2=new HashMap<>();
		m2.put("Atuk",1);
		m2.put("Ajay",2);
		m2.put("Akash",3);
		m2.put("Karan",4);
		m2.put(null,4);

		HashMap<String,Integer> m3=new HashMap<>();
		System.out.println("initial capacity are:"+m3);
		m3.putAll(m2);
		System.out.println(m3);
	}

}
