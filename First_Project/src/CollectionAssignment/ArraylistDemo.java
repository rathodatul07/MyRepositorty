package CollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

import Collection1.Customer;
import Inheritance.Employee;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> a=new ArrayList<Customer>();
		a.add(new Customer(2,"atul",34));
		a.add(new Customer(3,"ajay",43));
		a.add(new Customer(4,"asd",98));
		//System.out.println(a);
		
		Iterator<Customer> itr =a.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	for(Customer c: a)
	{
		System.out.println(c);
	}
	
	
	
	}

}
