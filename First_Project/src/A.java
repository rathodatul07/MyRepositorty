
public class A
{
int l,m,n;
public void operate(int a,int b,int c)
{
	int ans=a+b+c;
	System.out.println(ans);
}
	
	  A() { 
		  l=5; m=2; n=4; 
		  System.out.println();
		  }
	 
}
class B
{
	public void showSquare(A a)
	{
		System.out.println(a.l*2);
		System.out.println(a.m*2);
		System.out.println(a.n*2);
	}
}