package Methods;

import java.util.Scanner;

public class MadularApproch1MAx
{
	
	public int FindMaxNumber(int num1)
	{
	
		int max=num1%10;
		while(num1>10)
		{
			int digit=num1%10;
			if(digit>max)
			{
				max=digit;
			}
			num1=num1/10;
		}
		return max;
	}
	public int FindMinNumber(int num2)
	{
	
		int min=num2%10;
		while(num2<10)
		{
			int digit=num2%10;
			if(digit<min)
			{
				min=digit;
			}
			num2=num2/10;
		}
		return min;
	}


	public static void main(String[] args)
	{
		int num1,num2;
	Scanner sc=new 	Scanner(System.in);
	System.out.println("enetr number");
	num1=sc.nextInt();
	System.out.println("enetr number");
	num2=sc.nextInt();
	
	MadularApproch1MAx m= new MadularApproch1MAx();
	int s=m.FindMaxNumber(num1);
	System.out.println("max number are= "+s);
	
	int s1=m.FindMinNumber(num2);
	System.out.println("min number are="+s1);
	}
}
