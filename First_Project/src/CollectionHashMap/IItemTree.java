package CollectionHashMap;

import java.util.Comparator;
//its main method in Supplier Main
public class IItemTree {

	int i_id;
	String i_name;
	int i_cost;
	public IItemTree(int i_id, String i_name, int i_cost) {
		super();
		this.i_id = i_id;
		this.i_name = i_name;
		this.i_cost = i_cost;
	}
	
public String toString()
{
	return "\ni_id :"+i_id+"\n i_name: "+i_name+" \ni_cost: "+i_cost;
}
}
class Compar_i_cost implements Comparator<IItemTree>
{
	
	public int compare(IItemTree i1,IItemTree i2)
	{
		
	  if(i1.i_cost<i2.i_cost)
	   return -1;
	   else if(i1.i_cost>i2.i_cost)
		   return 1;
	   else
	   {
		   return i1.i_name.compareTo(i2.i_name);
	   }
	}
}