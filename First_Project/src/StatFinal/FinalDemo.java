package StatFinal;

public class FinalDemo 
{
 final int x=20;

 public void method2()//using final keyword we can override method in child class 
{
	System.out.println("this is final parents");
}

}

class ChildFinalDemo extends FinalDemo
{
	public void method2()
	{
		super.method2();
		System.out.println("this is final child");
	} 
}

