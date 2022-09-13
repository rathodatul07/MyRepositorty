package Inheritance;

public class Employee
{
int emp_id=3000;
String emp_name;
float emp_sal;
double amount;

public double calculateSal(double amt)
{
	
	return amt;
}
public  void cal()
{
	System.out.println("calculation");
}

}
class Hr extends Employee
{
	public double calculateSal(double amt)
	{
		
		System.out.println("Incetive:"+(emp_sal*amt));
		return amt;
	}
	public void cal()
	{
		System.out.println("calculation");
	}

	
}
class Developer extends Employee
{
	String skill;
	public double calculateSal(double amt)
	{
		return amt;
	}
	
	
}

class Manager extends Hr
{
	public double calculateSal(double amt)
	{
		return amt;
	}
	
}