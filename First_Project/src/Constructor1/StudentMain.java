package Constructor1;

public class StudentMain {

	public static void main(String[] args) {
		display2();
		Student.display2();
		Student s=new Student();
		System.out.println(".............................................................");
        s.disply();
		System.out.println(".............................................................");
		Student s2=new Student(4,"Atul","pune",78765432,9876567);
		System.out.println(s2.collegeName);
		s2.disply();
		System.out.println(".............................................................");
		Student s3=new Student(7,"Atul","pune",78765432,9876567);	
		System.out.println(s3.collegeName);
		s2.disply();
		System.out.println(".................");
		Student.display2();
		System.out.println("..............");
		Student s4=new Student();
		//s4.disply(6);
		 

	}

}
