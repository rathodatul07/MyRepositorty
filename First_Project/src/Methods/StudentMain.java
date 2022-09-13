package Methods;

public class StudentMain {

	public static void main(String[] args) 
	{
		Student s=new Student();
		s.acceptDetails(1, "Ajay", 40, 70);
		s.showDetails();
		s.acceptDetails(2, "Atul", 80, 50);
		s.showDetails();

	}

}
