package CollectionHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class AddValKey {

	public static void main(String[] args)
	{
		HashMap mp=new HashMap();
		
		for(int i=0;i<=mp.size();i++)
		{
			mp.put(2, "Atul");
			mp.put(5, "Ajay");
		}
		System.out.println(mp);
	}

}
