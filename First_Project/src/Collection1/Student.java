package Collection1;

import java.util.ArrayList;

public class Student 
{
	int id;
	String name;
	Student()
	{
		
	}
	Student(int i,String n)
	{
		id=i;
		name=n;
	}	
	public String toString()
	{
		String str="\nid :"+id+"\nname:"+name;
		return str;
	}
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(obj==null || this.getClass()!=obj.getClass())
		{
			return false;
		}
		Student s=(Student)obj;
		return this.id==(s.id) && this.name.equals(s.name);
	}
}
