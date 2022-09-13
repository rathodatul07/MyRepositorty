package Inheritance;

public class Fruit
{
 String color;
 int quantity;
 public Fruit()
 {
	 System.out.println("default constructor of parents");
 	color="yellow";
 	
 	
 	
 }
 public Fruit(String fcolor,int fquantity)
 {
	 System.out.println("this is parametrized constructor");
	 color=fcolor;
	 quantity=fquantity;
	 
	 
	 
 }
 
 

public void eat()
{
	System.out.println(color);
	
	 System.out.println(quantity);
}

}
class DryFruit extends Fruit
{

	String wholesaler;
	
	public DryFruit()
	{
		super("red",5);
		System.out.println("default constructor of child");
		wholesaler="Sharma";
	
		
	}
	
	
	public void dry()
	{
		System.out.println(wholesaler);
	}

}

