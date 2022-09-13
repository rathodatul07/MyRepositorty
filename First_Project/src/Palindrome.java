import java.util.Scanner;

public class Palindrome 
{
	public void pali(int num)
	{	
		int temp;
		int rev;
		int sum=0;
	temp=num;
	while(num>0)
	{
		rev=num%10;
		sum=(sum*10)+rev;
		num=num/10;
		
	}
	
	if(temp==sum)
	{
		System.out.println("this is palindrome");
	}
	else
	
		System.out.println("not palindrome");
	
	}
	
	public void striPali(String s)
	{
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println(s+":  is palindrome");
		}
		else
		{
			System.out.println(s+" : is not palindrome");
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
	
		Palindrome p=new Palindrome();
		int num=sc.nextInt();
		p.pali(num);
		System.out.println("enter String");
		String s=sc.next();
		p.striPali(s);
		
		
	
	
	
	}

}
