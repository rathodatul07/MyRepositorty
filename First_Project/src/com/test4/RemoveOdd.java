package com.test4;
import java.util.Scanner;
public class RemoveOdd 
{
public void remove(String str)
{
	String  str1="";
	
	for(int i=0;i<str.length();i++)
	{
		if(i%2==0)
		{
			str1=str1+str.charAt(i);
		}
	}
	System.out.println(str1);
}
	public static void main(String[] args)
	{
	Scanner sc=new 	Scanner(System.in);
	
	System.out.println("enter Sring");

	String str=sc.next();
	
	RemoveOdd r=new RemoveOdd();
	r.remove(str);

	}

}
