package com.Assignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		double first=sc.nextInt();
		System.out.println("enter second  number");
		double second=sc.nextInt();
		
		System.out.println("Addition are "+(first+second));
		System.out.println("substraction are "+(first-second));
		System.out.println("Multiplication are "+(first*second));
		System.out.println("division are "+(first/second));
	}

}
