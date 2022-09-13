package CollectionSet;

import java.awt.List;

public class Department
{
int d_id;
String name;
Student s1;
public Department(int d_id, String name,Student s1) {
	super();
	this.d_id = d_id;
	this.name = name;
	this.s1=s1;
}
public String toString()
{
	return d_id+" +"+name+" "+s1;
}

}
