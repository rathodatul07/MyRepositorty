package LooseCoupling;
class AgeNotApplicableException extends RuntimeException
{
	
	public String AgeNotApplicableException(String s)
	{
		super();
	}
}
public class Person 
{
int age;
int  adhar;
String name;
public Person()
{
	
}
public Person(int a,int ad,String n)
{
	age=a;
	adhar=ad;
	name=n;
}
public String toString()
{
	String str="\nage:"+age+"Adhar:"+adhar+":Name:"+name;
	return str;
}

public void chechEligibilityVaccive()
{
	try
{
	if(age>=16)
	{
		throw new AgeNotApplicableException();
	}
}
catch(AgeNotApplicableException e)
{
	e.getMessage();
}
	
	
}
}
