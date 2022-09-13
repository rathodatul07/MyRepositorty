package Containment;

public class Department 
{
int id;
String dname;

Department(int did,String name)
{
	id=did;
	dname=name;
}

public String toString()
{
	String str="\nid are:"+id+"\nname are:"+dname;
	return str;
}
}
