package Exception1;

class Test extends Exception
{
	public Test(String s)
	{
		super(s);
	}
}

public class Test1 
{
		public static void main(String[] args) 
		{
			try
			{
			throw new Test("invalid input");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			}
			
			
}
