package Methods;

import java.util.Scanner;

public class ModularApproch 
{
	 int a=10,b=20,c=0;
	public void Addition()
	{
		int c=a+b;
		System.out.println(c);
	}
	public int Substraction()
	{
		int c=a-b;
		return c;
		//System.out.println(c);
	}
	public void Division()
	{
		int c=a/b;
	}
	public void Multiplication()
	{
		int c=a*b;
	}

	public static void main(String[] args) 
	{
		
		ModularApproch m=new ModularApproch();
		Scanner sc=new Scanner(System.in);
		
		m.Addition();
		m.Substraction();
		int e=m.Substraction();
		System.out.println(e);//retuen type
		m.Division();
		m.Multiplication();
	}
	

}
