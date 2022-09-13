package CollectionSet;

public class Student
{
int id;
String name;
int roll_no;
public Student()
{
	
}
public Student(int id, String name, int roll_no) {
	super();
	this.id = id;
	this.name = name;
	this.roll_no = roll_no;
}
public String toString()
{
	return "id "+id+" name: "+name+" roll_no: "+roll_no;
}
public int hashCode()
{
	int prime=31;
	int result=1;
	result=prime*result+((name==null)?0:name.hashCode());
	result=prime*result+roll_no;
	return result;
}
public boolean equals(Object o)
{
	if(this==o)
	return true;
	if(o==null)
		return false;
	if(getClass()!=o.getClass())
		return false;
	
	Student os=(Student)o;
	if(name==null)
	{
		if(os.name!=null)
			return false;
		
	}
	else if(!name.equals(os.name))
		return false;
	if( roll_no!=os.roll_no)
		return false;
	return true;
}
}
