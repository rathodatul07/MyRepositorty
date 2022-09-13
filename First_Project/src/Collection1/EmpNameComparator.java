package Collection1;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee>
{
	public int compare(Employee a,Employee b)
	{
		return a.emp_name.compareTo(b.emp_name);
		}
}
