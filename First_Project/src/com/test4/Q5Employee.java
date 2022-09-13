package com.test4;

public class Q5Employee 
{
int emp_id;
String emp_name;
int emp_salary;

Q5Employee(int eid,String ename,int esalary)
{
	this.emp_id=eid;
	this.emp_name=ename;
	this.emp_salary= esalary;
}
public String toString()
{
	String str="\nemp_id:"+emp_id+"\nemp_name:"+emp_name+"emp_salary:"+emp_salary;
	return str;
}

public void display()
{
	System.out.println("\nemployee id:"+emp_id+"\nemployee name:"+emp_name+"employee salary:"+emp_salary);
}

}
