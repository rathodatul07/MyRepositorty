package ComparatorComparable;

public class Student implements Comparable<Student> {
	int roll_no;
	String name;
	int age;

	public Student() {

	}

	public Student(int roll_no, String name, int age) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "\n" + roll_no + "\n" + name + "\n" + age;
	}

	public int compareTo(Student s1) {
		if (this.age == s1.age)
			return 0;
		else if (age > s1.age)
			return 1;
		else
			return -1;
	}
}
