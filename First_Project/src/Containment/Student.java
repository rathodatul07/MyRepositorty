package Containment;

public class Student 
{
int rollNo;
String SName;
Department d;
Student(int rNo,String name,Department dp)
{
	rollNo=rNo;
	SName=name;
	d=dp;
}
public String toString()
{
	String str="\nRoll No:"+rollNo+"\nStudent Name:"+SName+"Department:"+d;
	return str;
}
}
