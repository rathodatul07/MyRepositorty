package Inheritance;

public class Grandfather 
{
	
 String gName="Dadaji";
 
public void Gname()
{
	System.out.println(gName);
}


}
class Parent extends Grandfather 
{
String pName="Papaji";
public void Pname()
{
	System.out.println(pName);
}

}
class child extends Parent
{
	String cName="son";
	public void Cname()
	{
		System.out.println(cName);
	}
}