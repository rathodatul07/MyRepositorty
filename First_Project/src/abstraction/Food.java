package abstraction;

abstract public class Food 
{
abstract public void reciepy();
abstract public void ingredient();
public void parcel(String s)
{
	System.out.println("Parcel Food ");
}

}

abstract class Paratha extends Food
{
	
	public void ingredient()
	{
		System.out.println("ingredient:MATAR,Aloo,Gobi");
	}
}
class AlluParatha extends Paratha
{
	public void reciepy()
	{
	System.out.println("Reciepy paratha ");	
	parcel("Paratha");
	}
	
}
class Omlet extends Food
{
	public void reciepy()
	{
		System.out.println("Omlet");
	}
	public void ingredient()
	{
		System.out.println("ingredient:eggs,oil");
	}
	
}


