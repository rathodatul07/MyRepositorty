package Inheritance;

public class Car 
{
final int speed=500;
String compony;
public Car()
{
	System.out.println("BMW");
	//speed=500;
	System.out.println(speed);
}
public void display()
{
	System.out.println(speed);
}
	
}
class AcCar extends Car
{
	public AcCar()
	{
		System.out.println("BMW");
	}
	public void display()
	{
		System.out.println(speed);
	}
}
