package Collection1;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		ArrayList<Employee> ar=new ArrayList<>();
		ar.add(new Employee(10, "Akash", 35));
		ar.add(new Employee(5, "Avinash", 45));
		ar.add(new Employee(30, "Sagar", 55));
		ar.add(new Employee(40, "Prakash", 15));
		ar.add(new Employee(8, "Akash", 65));
	//System.out.println(ar);
		/*Collections.sort(ar);//using comparable 
		System.out.println(ar);*/
		
		Collections.sort(ar, new EmpNameComparator());
		System.out.println(ar);
	}

}
