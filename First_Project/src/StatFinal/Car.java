package StatFinal;

public class Car 
{
String model="Mcz";
static int totalCarSold=700;

static public void ecar()
{
System.out.println(totalCarSold);//we can acces static var from static method

//System.out.println(model);//we can not access insatance var from static method
}
public void nonsta()
{
	System.out.println(totalCarSold);
}

public static void main(String[] args) 
{
	
	Car.ecar();
	Car c=new Car();
	c.nonsta();
	
}
}
