package Containment;

public class DepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department d=new Department(1,"cse");
		
		Student s=new Student(2,"ajay",d);
		System.out.println(s);
		
	}

}
