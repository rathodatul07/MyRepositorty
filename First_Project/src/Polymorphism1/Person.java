package Polymorphism1;

import LooseCoupling.Car;

public class Person 
{
	
	static	int age;
		String name;
		Car c;
		public Person() {}
		public Person(int a,String n,Car c)
		{
			age=a;
			name=n;
		   this.c=c;
		}
		public void planforVacation()
		{
			System.out.println(age);
			c.drive("Banglore","GOA");
			System.out.println("My vacation os full of Masti...");
		}
	}
 

