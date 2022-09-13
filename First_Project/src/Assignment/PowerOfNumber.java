package Assignment;

public class PowerOfNumber {

	public static void main(String[] args)
	{
		double a=10.0;
		int b=(int)a;
		
		
		System.out.println(b);		

		int num=345;
		int count=0;
		int mod=0;
		int sum=0;
		
			while(num>0)
			{
				mod=num%10;
				count++;
				num=num/10;
			}
			while(num>0)
			{
			mod=num%10;
			int p=mod*count;
			sum=sum+p;
			num=num/10;
		//	System.out.println(count);
			}
			System.out.println(count);
		
	}

}