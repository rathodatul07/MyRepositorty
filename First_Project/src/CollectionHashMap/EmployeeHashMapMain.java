package CollectionHashMap;


import java.util.*;
import java.util.Map.Entry;

public class EmployeeHashMapMain 
{
ArrayList<Employee> al=new ArrayList<>();

public EmployeeHashMapMain()
{
	al.add(new Employee(101,"Atul",23000,1001));
	al.add(new Employee(102,"Ajit",33000,1002));
	al.add(new Employee(103,"Ajay",6000,1001));
	al.add(new Employee(104,"Avi",6000,1002));
}
public void showDetails()
{
	Iterator<Employee> itr=al.iterator();
	System.out.println("employee detail");
	
	while(itr.hasNext())
	{
		Employee e=itr.next();
		System.out.println("\"emp_id :\"+emp_id+\" emp_name :\"+emp_name+\" salary :\"+salary+\" dep_id :\"+dep_id");
	}
}
public void newMap()
{
	HashMap<Integer,ArrayList<Employee>> mp=new HashMap<>();
	mp.put(1, al);
	HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	Collection<ArrayList<Employee>> collection=mp.values();
	for(ArrayList<Employee> clist: collection)
	{
		Iterator<Employee> itr=clist.iterator();
		
		while(itr.hasNext())
		{
			Employee c=itr.next();
			
			Integer sal=map.put(c.dep_id, c.salary);
			if(sal!=null)
			{
				map.put(c.dep_id, sal+c.salary);
			}
		}
	}
	
	System.out.println("Totall salary expenses with department :");
	Set<Entry<Integer,Integer>> entrySet=map.entrySet();
	Iterator<Entry<Integer,Integer>> itr=entrySet.iterator();
	while(itr.hasNext())
	{
		Entry<Integer,Integer> e=itr.next();
		System.out.println("Dept_id :"+e.getKey()+" "+"Totalq Salary Expenses :"+e.getValue());
	}
}
	public static void main(String[] args) {
		EmployeeHashMapMain e1=new EmployeeHashMapMain();
		e1.showDetails();
		e1.newMap();

	}

}
