package com.test3;

import java.util.Scanner;

public class Temprature 
{
public void show(double month)
{
	double low=0;
	for(int i=0;i<=month;i++)
	{
 
		{
			low=i;
		}
	}
}
	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);

double month[]=new double[30];
int n=month.length;
System.out.println("Enter month daily temprature");

for(int i=0;i<n;i++)
{
	month[i]=sc.nextDouble();
}

Temprature t=new Temprature();
t.show(month);
	}

}
