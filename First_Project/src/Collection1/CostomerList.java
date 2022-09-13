package Collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.Consumer;



public class CostomerList {
	
	
	ArrayList<Customer> l;
	public CostomerList()
	{
		l=new ArrayList<Customer>();
	}
	public void createCustomerList()
	{
		Customer c=new Customer();
		l.add(new Customer(1,"ajay",23));
		l.add(new Customer(2,"sagar",26));
		l.add(new Customer(3,"pranjal",33));
		l.add(new Customer(4,"atul",48));
		l.add(new Customer(5,"dnyanu",7));
		l.add(new Customer(5,"dnyanu",7));
		//System.out.println(l);
		
		
		
	}
	
	public void ShowCustName()
	{
		System.out.println("by name");
		  Collections.sort(l,new SortByName());
		  System.out.println(l);
		 
		
	}
	public void CustLamb()
	{
		System.out.println("uing for each");
		Consumer <Customer> c=(str) -> System.out.println(str);
		l.forEach(c);	
	}
	public void showCustomerList()
	{
		System.out.println("using for each loop");
		for(Customer c: l)
		{
			System.out.println(c);
		}
		System.out.println();	
	}
	public void showSort()//comparable
	{
		//Collections.sort(l);
		System.out.println(l);
	}
	public void showMinAge()
	{
		Iterator<Customer>cl=l.iterator();
		Customer ob=l.get(0);
		
		int min=ob.cust_age;
		System.out.println(min);
		
		while(cl.hasNext())
		{
			Customer o=cl.next();
			if(min>o.cust_age)
			{
				min=o.cust_age;
			}
		}
		show(min);
	}
	public void show(int min)
	{
		System.out.println("min age customer");
		Iterator<Customer>cl=l.iterator();
		
		while(cl.hasNext())
		{
			Customer o1=cl.next();
			
			 
		}

	}
	public void occurance()
	{
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==null)
				continue;
			System.out.println(l.get(i)+"occurance"+ Collections.frequency(l, l.get(i)));
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)!=null && l.get(i).equals(l.get(j)))
					l.set(j,null);
			}
		}
	}vh

	public static void main(String[] args) 
	{
		
		CostomerList obj=new CostomerList();
		obj.createCustomerList();
		obj.showCustomerList();
		//obj.showMinAge();
		obj.showSort();
		obj.ShowCustName();	
	    obj.occurance();
		
		
	}

}
