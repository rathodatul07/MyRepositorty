package StatFinal;

public class FinalDemoMain
{
	public static void main(String[] args) 
	{
		FinalDemo f=new FinalDemo();
	
		//System.out.println(f.x=40); here we can not change value of x,bcos x if final
		ChildFinalDemo c=new ChildFinalDemo();
	c.method2();	
	}
}
