package ObjArray;


public class Item
{
	String itemname,supername;
	 double cost;
	 
	  Item(String iName,String sName,double cst)
	 {
		 itemname=iName;
		 supername=sName;
		 cost=cst;
	 }
 	 public String toString()
		{
			String str="\nname:"+itemname+"\nsupername:"+supername+"\ncost:"+cost;
	        return str;
		}
	 public boolean equals(Object obj)
		{
			if(obj==null)return false;
			if(this==obj) return true;
			
			Item i=(Item) obj;
			if(this.itemname==i.itemname && this.supername==i.supername && this.equals(i.cost))
		return true;
		else
			return false;
		
		}
	 
	 
}
