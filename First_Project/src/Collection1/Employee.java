package Collection1;

import java.util.Comparator;

public class Employee /* implements Comparable<Employee> */
{

	int emp_id;
	String emp_name;
	int emp_age;

	
	Employee(int emp_id,String emp_name,int emp_age)
	{
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_age=emp_age;
	}
	public String toString()
	{
		String str="\nid: "+emp_id+"\nname: "+emp_name+"\nAge: "+emp_age;
		return str;
	}
	/*public int compareTo(Employee e)//override compareTo(); for comparable
	{
		return this.emp_id-e.emp_id;
	}*/

}
