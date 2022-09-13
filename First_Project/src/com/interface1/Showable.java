package com.interface1;

public interface Showable 
{
void m1();
}
 class A7 implements Printable,Showable
 {
	public  void m1()
	{
		System.out.println("this is M1 Method");
	}
	public void print()
	{
		System.out.println("Hello");
	}
	
 }