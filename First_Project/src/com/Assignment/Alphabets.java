package com.Assignment;

import java.util.Scanner;

public class Alphabets {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any alphabets");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
		{
		System.out.println(ch +" is Vowel ");	
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		{
			System.out.println(ch +" is Consonant");
		}
		else
		{
			System.out.println(ch +" is not alphabets");
		}
	}

}
