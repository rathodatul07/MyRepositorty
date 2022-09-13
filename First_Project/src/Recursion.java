
public class Recursion 
{
public int  sum(int n)
{
	
	if(n!=0)
	{
		return n+sum(n-1);
	}
	else
		return n;
}
	public static void main(String[] args) 
	{
		Recursion r=new Recursion(); 
		int n=1;
		
		System.out.println(r.sum(5));
		
		
	}

}
