package com.interface1;

 interface Printable1 
{
void print();
}
interface Showable1
{
	void print();
}
 
 class TestInterface3 implements Printable1,Showable1
 {
	public  void print()
	 {
		System.out.println("Welcome"); 
	 }
 }