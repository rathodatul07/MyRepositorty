package com.test4;

import pack2.com.E;

public class Q5EmployeeDet 
{

	
public void AcceptDetails(Q5Employee e[])
{
	 e[0]=new Q5Employee(101,"Atul",10000);
	 e[1]=new Q5Employee(102,"Ajay",20000);
	 e[2]=new Q5Employee(103,"Avinash",30000);
	 e[3]=new Q5Employee(104,"Manoj",40000);
	 e[4]=new Q5Employee(105,"Akshay",65000);
	 
}
public void heighestSalary(Q5Employee e[])
{
	int  high=e[0].emp_salary;
	int high1=0;
	for(int i=0;i<e.length-1;i++)
	{
		if(e[i].emp_salary>high1)
		{
			high1=e[i].emp_salary;
			high=i;
			
		}
	}
	System.out.println("maximum employee salary is:"+high1);
	System.out.println("maximum employee salary is:"+e[high]);
}
public void aboveSalary(Q5Employee e[])
{
	
	for(int i=0;i<e.length-1;i++)
	{
		if(e[i].emp_salary>60000)
		{
			System.out.println(e[i]);
		} 
	}
}
}

