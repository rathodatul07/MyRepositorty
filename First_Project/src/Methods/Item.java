package Methods;

public class Item
{   static double gst=40000;
	 int itemId;
	 String itemname,supername;
	 double cost;

	public String toString()
	{
		String str="\nitemId:"+itemId+"\nitemname:"+itemname+"\nsupername:"+supername;
        return str;
	}
	
	
	  public int getItemid()
	  {
		  return itemId; 
		  } 
	  public void setItemId(int iId) 
		  {
	  itemId=iId;
	  } 
		  public String getItemName()
		  {
			  return itemname;
			  }
		  public void setItemName(String iName)
		  { 
			  itemname=iName;
			  }
		  public String getSuperName()
			  {
	       return supername;
	  }
			  public void setSuperName(String sName)
	  {
				  supername=sName;
	  } 
			  public double getCost()
			  { 
				  return cost; 
			  } 
			  public void setcost(int cst)
			  {
	  cost=cst; }
	 
Item()
{
	itemId=101;
	itemname="Atul";
	supername="ajay";
	cost=1000;
}
Item(int id,String n,String s,double cst)
{
	itemId=id;
	itemname=n;
	supername=s;
	cost=cst;
}


	public void  acceptDetails(int id,String n,String suname,int cst)
	{
		itemId=id;
		itemname=n;
		supername=suname;
		cost=cst;
		
	}
	public void showItemDetails()
	{
		System.out.println("item Id: "+itemId+" itemName is : "+itemname+" supername is : "+supername+" cost is: "+cost);
	}
	public static void Show()
	{
		gst=5000;
	}
}
