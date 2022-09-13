package Exception1;

public class ExceptTest {

	public static void main(String[] args) {
	int a[]=new int[2];
	try
	{
	System.out.println(a[3]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception thrown:"+e);
	}
	finally
	{
		a[0]=6;
	System.out.println(a[0]);
	}
	}

}
