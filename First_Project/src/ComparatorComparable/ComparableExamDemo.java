package ComparatorComparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExamDemo {
	public static void main(String[] args) {

		Student s1 = new Student(1, "Atul", 25);
		Student s2 = new Student(2, "Ajay", 35);
		Student s3 = new Student(3, "Atul", 35);
		Student s4 = new Student(4, "Pranav", 45);
		Student s5 = new Student(1, "Atul", 10);

		ArrayList<Student> al = new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		Collections.sort(al);
		System.out.println(al);
	}
}
