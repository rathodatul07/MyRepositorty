package com.interface1;

public class PrintingPress
{
	public static void main(String[] args) {
		  
		
		Edit e=new Magzine();
		e.read();
		e.upgate();
		e.write();
		
		System.out.println("...........................");
	    
		e=new NewsPaper();
		e.read();
		e.upgate();
		e.write();
		
		System.out.println("...............................");
		
		
				 

	}

}
