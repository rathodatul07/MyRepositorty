package Collection1;

import java.util.Comparator;

public class EmployeeIdComparator implements Comparator<Employee> 
{

public int compare(Employee a,Employee b)
{
	return a.emp_id-b.emp_id;
}
}
