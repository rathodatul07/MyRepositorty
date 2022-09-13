package Collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparaterByName {

	public static void main(String[] args) {
		ArrayList<Customer> l=new ArrayList<Customer>();
		l.add(new Customer(20,"sagar",26));
		l.add(new Customer(30,"pranjal",33));
		l.add(new Customer(10,"ajay",23));
		l.add(new Customer(40,"atul",48));
		l.add(new Customer(50,"dnyanu",7));
		l.add(new Customer(50,"dnyanu",7));
System.out.println(l);

Collections.sort(l,new SortByNameComparator());

	}

}
