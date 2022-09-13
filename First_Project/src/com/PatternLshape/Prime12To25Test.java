package com.PatternLshape;

import java.util.Scanner;

public class Prime12To25Test {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number first");
		int num1=sc.nextInt();
		System.out.println("enter number Second");
		int num2=sc.nextInt();
		int count=0;
		for(int i=num1;i<=num2;i++)
		{
			if(num1%2==1)
			{
				
			count++;	
			}
		}
		System.out.println(count);
	}

}
