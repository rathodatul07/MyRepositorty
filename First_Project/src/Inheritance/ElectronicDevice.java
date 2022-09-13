package Inheritance;

public class ElectronicDevice 
{
int quantity;
float itemPrice;
int amount=500;

protected void doSale(int qnt,float itemP)
{
	quantity=qnt;
	itemPrice=itemP;
	
	System.out.println("Quantity of Devies: "+quantity);
	System.out.println("prices if Item:"+itemPrice);
}
public static void doget()
{
	System.out.println("do Get Parents ");
}

}
class TeleVision extends ElectronicDevice
{
	
	protected void doSale(int qnt,float itemP)
	{
		super.doget();
		System.out.println("Quantity of television:"+quantity);
		System.out.println("Price of Television:"+itemPrice);
	}
	public static void doget()
	{
		System.out.println("do Get Parents ");
	}

	
	
}
class WashingMachine extends ElectronicDevice
{
	protected void doSale(int qnt,float itemP)
	{
		super.doget();
		System.out.println("Quantity of WashingMachine:"+quantity);
		System.out.println("Price of WashingMachine:"+itemPrice);
	}
	
}
class Fridge extends ElectronicDevice
{
	protected void doSale(int qnt,float itemP)
	{
		System.out.println("Quantity of Fridge:"+quantity);
		System.out.println("Price of Fridge:"+itemPrice);
	}
}