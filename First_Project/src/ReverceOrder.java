
public class ReverceOrder {

	public static void main(String[] args) 
	{
		
		int n=3145;
		int reverce=0;
		while(n!=0)
		{
			reverce=reverce*10;//0
			reverce=reverce+n%10;//0+(3145)%10=5
			n=n/10;//314
		}
		System.out.println(reverce);
		}

}
