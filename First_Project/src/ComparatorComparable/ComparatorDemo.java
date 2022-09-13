package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorDemo {

	public static void main(String[] args) {

		StudentComparator s1 = new StudentComparator(1, "Atul", 25);
		StudentComparator s2 = new StudentComparator(2, "Mohan", 35);
		StudentComparator s3 = new StudentComparator(3, "Atul", 35);
		StudentComparator s4 = new StudentComparator(4, "Pranav", 45);
		StudentComparator s5 = new StudentComparator(1, "Atul", 10);

		ArrayList<StudentComparator> al = new ArrayList<StudentComparator>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		// Collections.sort(al,new AgeCompa());

		// sorting by age
		Collections.sort(al, new NameCompa());// sorting by name

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Collections.sort(al,new roll_NoCompa());//sorting by Roll No
		// System.out.println(al);
	}
}

class AgeCompa implements Comparator<StudentComparator> {
	public int compare(StudentComparator s1, StudentComparator s2) {
		return s1.age - s2.age;
	}
}

class NameCompa implements Comparator<StudentComparator> {
	public int compare(StudentComparator s1, StudentComparator s2) {
		return s1.name.compareTo(s2.name);
	}
}

class roll_NoCompa implements Comparator<StudentComparator> {
	public int compare(StudentComparator s1, StudentComparator s2) {
		return s1.roll_no - s2.roll_no;
	}
}