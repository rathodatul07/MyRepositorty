package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class StudentSetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student(1,"Ajay",23);
		Student st2=new Student(2,"Ajay",23);
		Student st3=new Student(3,"Akash",33);

		Set<Student> ss=new HashSet();//HashSet
		ss.add(st1);
		ss.add(st2);
		ss.add(st3);
		System.out.println(ss);
		System.out.println("HashSet Using Iterator");
		Iterator itr=	ss.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		LinkedHashSet<Integer> ls=new LinkedHashSet<>();//linkedhashset
		ls.add(1000);
		ls.add(null);
		ls.add(235);
		ls.add(10);
		System.out.println(ls);
		HashSet<Integer> ls1=new HashSet<>();
		ls1.add(100);

		ls1.add(23);
		ls1.add(122);
		System.out.println(ls1);
		ls1.addAll(ls);
		System.out.println("after adding: "+ls1);
		Iterator itr1=	ls1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}

		TreeSet<Integer> ts1=new TreeSet<>();
		ts1.add(42);
		ts1.add(23);
		ts1.add(44);
		ts1.add(10);
		ts1.add(98);
		ts1.add(78);

		System.out.println(ts1);
		System.out.println(ts1.lower(98));
		System.out.println(ts1.higher(23));
		System.out.println(ts1.headSet(43, true));
		System.out.println(ts1.tailSet(98));
		System.out.println(ts1.first());
		System.out.println(ts1.last());
		System.out.println(ts1.pollFirst());
		System.out.println(ts1.pollLast());
		System.out.println(ts1.ceiling(34));
		System.out.println(ts1.floor(42));
	}

}
