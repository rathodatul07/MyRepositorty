package Collection1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Customer 

{
	int cust_Id;
	String cust_name;
	int cust_age;

	public Customer()
	{

	}

	public Customer(int id,String n,int a)
	{
		cust_Id=id;
		cust_name=n;
		cust_age=a;

	}
	public String toString()
	{
		return "\nCostomer id:"+cust_Id+"\nCostomer name:"+cust_name+"\nCostomer age:"+cust_age+"";
	}

	public int compareTo(Customer o) {

		if(this.cust_age>o.cust_age)
			return -1; 
		else if(o.cust_age<o.cust_age) return
				1;
		else if(this.cust_name.compareTo(o.cust_name)<0)
			return 1;
		else
				if(this.cust_name.compareTo(o.cust_name)>0)
					return -1; else return 0; 
		}

}

