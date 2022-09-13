package Collection1;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>
{
public int compare(Employee a1,Employee b1)
{
	return a1.emp_age-b1.emp_age;
}
}
