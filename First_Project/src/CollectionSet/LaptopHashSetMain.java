package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class LaptopHashSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<LaptopHashSet> hs=new HashSet<LaptopHashSet>();
		hs.add(new LaptopHashSet("HP","Windows 7", 134));
		
		hs.add(new LaptopHashSet("Dell","Windows 8", 135));
		hs.add(new LaptopHashSet("Lenovo","Windows 9", 136));
		hs.add(new LaptopHashSet("Apple","Windows 10", 137));
		Iterator<LaptopHashSet> itr=hs.iterator();
		while(itr.hasNext())
		{
			LaptopHashSet lo=itr.next();
			System.out.println(lo);
		}
		
	}

}
