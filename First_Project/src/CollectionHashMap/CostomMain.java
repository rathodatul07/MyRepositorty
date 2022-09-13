package CollectionHashMap;

import java.util.HashMap;

public class CostomMain {

	public static void main(String[] args) {

		HashMap<Custom,Integer> hm=new HashMap<>();
		hm.put(new Custom(1,"Ajay"), 60);
		hm.put(new Custom(2,"Atul"), 20);
		hm.put(new Custom(3,"Rohan"), 10);
		hm.put(new Custom(3,"Rohan"), 10);
		System.out.println(hm);
		HashMap<Custom,Student> hm1=new HashMap<>();
		hm1.put(new Custom(1,"Ajay"), new Student(1, "Akya", 100));
		System.out.println(hm1);
	}

}
