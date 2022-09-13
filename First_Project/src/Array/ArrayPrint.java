package Array;

import java.util.Scanner;

public class ArrayPrint 
{
	public static void main(String[] args)
	{
		System.out.println("enetr size");
    	Scanner sc=new Scanner(System.in);
    	int size=sc.nextInt();
    	int a[]=new int[size];
	 System.out.println("enetr element");
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("enetred element are:");
	for(int i=0;i<=a.length-1;i++)
	{
		System.out.println(a[i]);
	}
	
	System.out.println("output are:");
	for(int i=a.length-1;i>=1;i--)
	{
		System.out.println(a[i]);
	}
	
	}

}
