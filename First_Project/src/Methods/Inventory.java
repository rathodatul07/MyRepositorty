package Methods;

import java.util.Arrays;

public class Inventory 
{
public void Accept(Item[] i4)
{
	i4[0]=new Item(101  ," Ajay","Aj", 5);
	i4[1]=new Item(102  ," Atul","A", 6);
	i4[2]=new Item(103  ,"Soham","AB", 5);
}
public void Show(Item[] i4)
{
	System.out.print(Arrays.toString(i4));
}
	public static void main(String[] args)
	{
		/*
		 * Item i=new Item(); System.out.println("................................");
		 * i.getItemid(); i.setItemId(1); System.out.println("Id:"+i.getItemid());
		 * i.getItemName(); i.setItemName("Atul");
		 * System.out.println("Name:"+i.getItemName()); i.setSuperName("A");
		 * System.out.println("S_name:"+i.getSuperName()); i.setcost(599);
		 * System.out.println("Cost Are:"+i.getCost()); Item i1=new Item();
		 * i1.acceptDetails(3, "Ajay", "At", 60000); i1.showItemDetails();
		 * System.out.println("Gst Are :"+i1.gst); Item i2=new Item();
		 * i2.acceptDetails(3, "Atul", "aj", 8999); i2.showItemDetails();
		 * System.out.println("GST are"+i2.gst); System.out.println(Item.gst);
		 */
System.out.println("..............................................................");

Inventory s=new Inventory();
	Item[] i4=new Item[3]; 
	s.Accept(i4);
	s.Show(i4);
	}
	
	

}
