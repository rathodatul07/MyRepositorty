package Containment;

public class OutHMain {

	public static void main(String[] args)
	{
		Outhouse o=new Outhouse(5,7.8);
		Banglow b=new Banglow("ajay","sharma",4.7,o);
		
		System.out.println(b);

	}

}
