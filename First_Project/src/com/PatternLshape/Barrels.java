 package com.PatternLshape;

import java.util.Scanner;

public class Barrels 
{
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter barrels");
	
int fuel_barrels=sc.nextInt();
int price;


if(fuel_barrels<10)
{
	
	System.out.println("total barrels are := "+fuel_barrels+"total barrels price are:"+(89*fuel_barrels));

}
else if(fuel_barrels>=10)
{
	price=fuel_barrels*(89-fuel_barrels);
	System.out.println("total barrels are :"+fuel_barrels+"per barrels price are:"+price);
}


}
}