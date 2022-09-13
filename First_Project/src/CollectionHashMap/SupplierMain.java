package CollectionHashMap;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class SupplierMain {

	public static void main(String[] args) {
		TreeMap<Integer,String> tm2=new TreeMap<>();	
		/*tm2.put(22, "Ajay");
		tm2.put(25, "Atul");
		tm2.put(26, "Akash");
		tm2.put(21, "Ajay");*/
		//System.out.println(tm2.descendingMap());
		//IItemTree obj=new IItemTree();
		TreeMap<IItemTree,Integer> tm=new TreeMap<>(new Compar_i_cost());
		tm.put(new IItemTree(101, "BasketBall", 15000), 1);
		tm.put(new IItemTree(102, "TenisBal", 15000), 2);
		tm.put(new IItemTree(101, "BasketBall", 25000), 10);
		tm.put(new IItemTree(103, "Bat", 3300), 3);
		tm.put(new IItemTree(103, "Bat", 3300), 3);
		//System.out.println(tm);
		
		TreeMap<IItemTree,SupplierTree> tm4=new TreeMap<IItemTree,SupplierTree>((Collections.reverseOrder(new Compar_i_cost() )));
		tm4.put(new IItemTree(101, "BasketBall", 1000), new SupplierTree(1001,"Mr. Sharma"));
		tm4.put(new IItemTree(102, "TenisBal", 2000), new SupplierTree(1002,"Mr. Aditya"));
		tm4.put(new IItemTree(103, "Bat", 5000), new SupplierTree(1003,"Mr. Kumar"));
		tm4.put(new IItemTree(104, "Net", 4000), new SupplierTree(1004,"Mr. Ramnath"));
		tm4.put(new IItemTree(105, "Stump", 3000), null);
		System.out.println(tm4);
		System.out.println("Size is: "+tm4.size());
		System.out.println("Empty or not:"+tm4.isEmpty());
		System.out.println("Descending map"+tm4.descendingMap());
		//SortedMap<IItemTree,SupplierTree> sm=tm4.subMap(tm, tm4);
		//System.out.println(tm4);
				
	}

}
