package com.interface1;

public interface Edit 
{

	 void read();
	 void upgate();
	 default void write()
	 {
		 System.out.println("this is default method in write");
	 }
	
}
class Magzine implements Edit
{
	public void read()
	{
		System.out.println("this is read method");
	}
	public void upgate()
	{
	System.out.println("update here");	
	}
	public void write()
	{
		System.out.println("write here");
	}
	
}

class NewsPaper implements Edit
{

	public void read()
	{
		System.out.println("this is read method");
	}
	public void upgate()
	{
	System.out.println("update hereA");	
	}
	
}


//class Book extends Magzine 
//{
	
/*	public void read()
	{
		System.out.println("this is read method Book");
	}
	public void upgate()
	{
	System.out.println("update here of Book");	
	}
	public void write()
	{
		System.out.println("write here for Book");
	}*/
	
//}