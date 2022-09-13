package Collection1;

import java.util.ArrayList;

public class StudentMain {
	public void checkOccu(ArrayList<Student> al)
	{
		for(int i=0;i<al.size();i++)
		{
			if(al.get(i)==null)
			continue;
			int count=1;
			for(int j=i+1;j<al.size();j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					count++;
					al.set(j, null);
				}
			}
			System.out.println(al.get(i)+" Ocurs at:"+count);
		}
	}
	
	public static void main(String[] args) 
	{
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"A"));
		al.add(new Student(1,"AF"));
		al.add(new Student(1,"A"));
		al.add(new Student(15,"b"));
		al.add(new Student(15,"b"));
		al.add(new Student(15,"b"));
		System.out.println(al);
		StudentMain s1=new StudentMain();
		s1.checkOccu(al);
		
	}

}
