package CollectionSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;



public class TreeSetItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Item> ts=new TreeSet<>();
Item o1=new Item(101,"Basket Ball",4000);
Item o2=new Item(100,"Tennis Ball",2000);
Item o3=new Item(111,"Basket Ball",7000);
Item o4=new Item(118,"Hockey Stick",5000);
Item o5=new Item(113,"Bat ",1000);


ts.add(o1);
ts.add(o2);
ts.add(o3);
ts.add(o4);
ts.add(o5);
//System.out.println(ts);



Iterator itr=ts.iterator();

while(itr.hasNext())
{
	System.out.println(itr.next());
}
System.out.println("Descending Iterator");
itr=ts.descendingIterator();
for(;itr.hasNext();)
{
	System.out.println(itr.next());
}
NavigableSet<Item> reverseSet=ts.descendingSet();
System.out.println(".............................Descending Set");
for(Item i1:reverseSet)
{
	System.out.println(i1);
}
System.out.println(".......................................Comparator");
TreeSet<Item> ts2=new TreeSet<>(new ItemPriceComparator());
ts2.add(o1);
ts2.add(o2);
ts2.add(o3);
ts2.add(o4);
ts2.add(o5);
//System.out.println(ts2);
itr=ts2.descendingIterator();
for(;itr.hasNext();)
{
	System.out.println(itr.next());
}

	}

}
