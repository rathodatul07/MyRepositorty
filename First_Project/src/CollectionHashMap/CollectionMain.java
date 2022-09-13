package CollectionHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(2, "aaaa");
		hm.put(3, "bbbb");
		hm.put(4, "ccccc");
		
		Set<Integer> keySet=hm.keySet();
		Set<Entry<Integer, String>> ValSet=hm.entrySet();
		
        ArrayList al=new ArrayList(keySet); 
        //al.add(hm);
        System.out.println(al);
       Iterator itr=al.iterator();
       while(itr.hasNext())
    	   {
    	   System.out.println(itr.next());
    	   }
       
	}

}
