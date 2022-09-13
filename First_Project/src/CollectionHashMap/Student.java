package CollectionHashMap;

public class Student 
{
	int id;
	String name;
	int marks;

	Student()
	{

	}
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public String toString()
	{
		return "id :"+id+" name :"+name+" marks :"+marks;
	}
	public int hashCode()
	{
		int answer=0;
		answer=id+(marks*2)+name.hashCode();
		return answer;
	}

	public boolean equals(Object o)
	{
		if(this==o)
			return true;
		if(o==null)
			return false;
		if(this.getClass()!=o.getClass())
			return false;
		Student s=(Student)o;
		if(this.id==s.id && this.marks==s.marks && this.name==s.name)
			return true;
		else 
			return false;
	}
}
