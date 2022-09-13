package com.interface1;

public interface Printable3 
{
void print();
}
interface Showable3 extends Printable3
{
	void show();
	
} 
class Test4 implements Showable3
{
	public void show()
	{
		System.out.println("this method from showabble");
	}
	public void print()
	{
		System.out.println("this is method from printable");
	}
	
}