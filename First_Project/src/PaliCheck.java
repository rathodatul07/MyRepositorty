import java.util.Scanner;

public class PaliCheck {

	public void pCheck(int num)
	{
		int temp=num;
		int sum=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("p");
		}
		else
		{
			System.out.println("np");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		PaliCheck p=new PaliCheck();
		p.pCheck(num);
	}

}
