import java.util.Scanner;

public class Prime {
	public void prime11(int num)
	{ 
		int count=0;
		int i;
		for(i=1;i<=num;i++)
		{
			
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println("it is prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		Prime p=new Prime();
		p.prime11(num);
	}

}
