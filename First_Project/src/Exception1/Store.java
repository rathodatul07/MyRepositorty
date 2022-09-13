package Exception1;
class ItemStockOverFlowException extends Exception
{
	public String getMessage()
	{
		return " item can not be greater than maximum ";
	}
}
class ItemStockUnderFlowException extends Exception
{
	public String getMessage()
	{
		return " item should be greater than minimum";
	}
}

public class Store 
{
int noOfItemAvailable,maximunLevel,minimumLevel;
static int itemNo;

public Store(int a,int b,int c)
{
	noOfItemAvailable=a;
	maximunLevel=b;
	minimumLevel=c;
}

public void addItem(int a) throws ItemStockOverFlowException
{


if(noOfItemAvailable+a>maximunLevel)
{
	throw new ItemStockOverFlowException();
}

	noOfItemAvailable=noOfItemAvailable+a;

}

public void removeItem(int b) throws ItemStockOverFlowException
{
	if(noOfItemAvailable-b>maximunLevel)
	{
		throw new ItemStockOverFlowException();
	}

		noOfItemAvailable=noOfItemAvailable-b;
	
}
public int checkStock()
{
	return noOfItemAvailable;
}

}
