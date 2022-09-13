package CollectionHashMap;

import java.util.HashMap;

public class WithoutUseGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap mp=new HashMap();
		mp.put(101, "Deepak");
		mp.put("Deepak",101);
		System.out.println(mp);
	}

}
