package Containment;

public class Person
{
private String name,gender,address;
private int age;

Person(String pname,String pgender,String paddress,int page)
{
name=pname;
gender=pgender;
address=paddress;
age=page;
}
public String toString()
{
	String str="\n"+name+",\n"+gender+","+address+","+age;
	return str;
}


public void setName(String pname)
{
	name=pname;
}
public String getName()
{
	return name;
}
public void setAge(int page)
{
	age=page;
}
public int getAge()
{
	return age;
}
public void setGender(String pgender)
{
	gender=pgender;
}
public String getGender()
{
	return gender;
}
public void setAddress(String paddress)
{
	address=paddress;
}
public String getAddress()
{
	return address;
}

}
