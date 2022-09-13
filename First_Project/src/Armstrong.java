import java.util.Scanner;

public class Armstrong {
public void arm(int num)
{
int rem=0;
int sum=0;

int temp=num;
while(num>0)
{
	rem=num%10;
	sum=sum+(rem*rem*rem);
	num=num/10;
}
if(sum==temp)
{
	System.out.println("it is armstrong");
	
}
else
{
	System.out.println("not armstrong");
}
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		Armstrong a=new Armstrong();
		a.arm(num);
	}

}
