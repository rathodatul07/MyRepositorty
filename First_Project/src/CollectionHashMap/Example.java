package CollectionHashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> mp=new HashMap<>();
		mp.put("Mr.Abc", "BJP");
		mp.put("Mr.XYZ", "NCP");
		mp.put("Mr.ccc", "BJP");
		mp.put("Mr.LLL", "Shivsena");
		System.out.println(mp);
		HashMap<String, Integer> mp1=new HashMap<>();
		Set<Entry<String,String>> entrySet=mp.entrySet();
		Iterator<Entry<String.String>> entrySet.iterator();

	}

}
