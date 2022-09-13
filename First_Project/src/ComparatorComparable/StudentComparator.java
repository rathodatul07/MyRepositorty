package ComparatorComparable;

public class StudentComparator 
{
	int roll_no;
	String name;
	int age;

	public StudentComparator() {

	}

	public StudentComparator(int roll_no, String name, int age) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "\n" + roll_no + "\n" + name + "\n" + age;
	}
	
}
