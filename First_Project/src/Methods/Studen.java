package Methods;

public class Studen 
{
String name="atul";

public void PrintName(Studen obj)
{
	System.out.println(obj.name);
}
	public static void main(String[] args)
	{
		
		Studen s=new Studen();
		s.PrintName(s);
	}

}
