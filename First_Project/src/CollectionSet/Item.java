package CollectionSet;

import java.util.Comparator;

public class Item implements Comparable<Item>
{
int item_id;
String item_Name;
int Item_Price;
public Item(int item_id, String item_Name, int item_Price) {
	super(); 
	this.item_id = item_id;
	this.item_Name = item_Name;
	Item_Price = item_Price;
}
public String toString()
{
	return "item_id :"+item_id+" item_Name: "+item_Name+" Item_Price: "+Item_Price;
}
public int compareTo(Item i1)
{
	if(item_id<i1.item_id)
		return-1;
	else if(item_id>i1.item_id)
		return 1;
	else 
		return 0;
}


}
/*class ItemPriceComparator implements Comparator<Item>
{
	public int compare(Item o1,Item o2)
	{
		if(o1.Item_Price< o2.Item_Price)
			return 1;
		else if(o1.Item_Price> o2.Item_Price)
			return -1;
		else return 0;
	}

}*/
class CostComparator implements Comparator<Item>
{
	public int compare(Item o1,Item o2)
	{
		return o1.Item_Price-o2.pri
	}
}