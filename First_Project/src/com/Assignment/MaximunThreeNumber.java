package com.Assignment;

import java.util.Scanner;

public class MaximunThreeNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int first=sc.nextInt();
		System.out.println("enter second number");
		int second=sc.nextInt();
		System.out.println("enter third number");
		int third=sc.nextInt();
		
		if((first>=second)&&(first>=third))
		{
			System.out.println(first+" is maximum numbetr ");
		}
		else if((second>=first)&&(second>=third))
		{
			System.out.println(second+" is maximum number");
		}
		else
		{
			System.out.println(third+" is maximum");
		}
	}

}
