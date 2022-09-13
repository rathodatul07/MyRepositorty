package com.PatternLshape;

import java.util.Scanner;

public class Fuel_Barrels {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter barrels");
	
int fuel_barrels=sc.nextInt();
int price;
int total_Price=0;
	for(int i=fuel_barrels;i<=20;i++)
	{
		if(fuel_barrels<10)
		{
			price=89;
			fuel_barrels=fuel_barrels;
			total_Price=89*fuel_barrels;
			
		}
		else if(fuel_barrels>=10)
		{
			total_Price=fuel_barrels*(89-fuel_barrels);
			fuel_barrels=fuel_barrels;
		}
		
	}

	}

}
