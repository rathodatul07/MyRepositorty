package CollectionHashMap;

public class Employee
{
int emp_id;
String emp_name;
int salary;
int dep_id;

Employee()
{
	
}
public Employee(int emp_id, String emp_name, int salary, int dep_id) {
	super();
	this.emp_id = emp_id;
	this.emp_name = emp_name;
	this.salary = salary;
	this.dep_id = dep_id;
}
public String toString()
{
	return "emp_id :"+emp_id+" emp_name :"+emp_name+" salary :"+salary+" dep_id :"+dep_id;
}

}
