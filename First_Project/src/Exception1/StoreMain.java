package Exception1;

public class StoreMain 
{
	public static void main(String[] args) 
	{
		Store s=new Store(40,100,500);
		try
		{
			s.addItem(4);
			s.removeItem(5);
		}
		
		catch(ItemStockOverFlowException e)
		{
			System.out.println(e.getMessage());
		}
	}
}