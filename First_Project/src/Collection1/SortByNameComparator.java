package Collection1;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Customer>
{
	public int compare(Customer c1,Customer c2)
	{
		if(c1.cust_age==c2.cust_age)
		{
			return 0;
		}
		else if(c1.cust_age>c2.cust_age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		
	}
}
