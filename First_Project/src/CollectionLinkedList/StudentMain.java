package CollectionLinkedList;

import java.util.ArrayList;

public class StudentMain {

	public static void main(String[] args)
	{

		ArrayList<Student> al1=new ArrayList<>();
		al1.add(new Student(1, "Akshay", 65, 0));
		al1.add(new Student(2, "Ashraf", 85, 0));
		ArrayList<Student> al2=new ArrayList<>();
		al2.add(new Student(1, "Akshay", 0, 65));
		al2.add(new Student(2, "Ashr af", 0, 85));
        System.out.println(al2);
}

}
