package Assignment;

import java.util.Scanner;

public class MaxDigit 
{
	public int FindMaxNumber(int num1)
	{
	
		int max=num1%10;
		while(num1>0)
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

	
	public static void main(String[] args) {
		MaxDigit m=new MaxDigit();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter some number");
	int num1=sc.nextInt();
     int max1=m.FindMaxNumber(num1);
     System.out.println("Heighest digit are:"+max1);
	}
}
