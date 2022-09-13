package Containment;

public class Institute 
{
int id;
String insname;

Institute(int did,String name)
{
	id=did;
	insname=name;
	}

public String toString()
{
	String str="\nid are:"+id+"\nname are:"+insname;
	return str;
}
}
