package Exception1;

public class ArithmaticException {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("this is first line from try");
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
			System.out.println("third lind from try");
			
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("this is in catch block");
			System.out.println(e.toString());
		}
		
		finally
		{
			System.out.println("this is finally block....cleanup code...");
			
		}

	}

}
