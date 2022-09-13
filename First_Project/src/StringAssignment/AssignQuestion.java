package StringAssignment;

import java.util.Scanner;

public class AssignQuestion
{
public void adding(String s)
{
	int no=s.length();
	if(no>=3)
	{
		String s2="";
		String s3="";
		String s4="ly";
		String s5="ing";
		
		for(int i=s.length()-1,cnt=1;i>=0;i--,cnt++)
		{
			s2+=s.charAt(i);
			if(cnt==3)
			break;
		}
		for(int i=s2.length()-1;i>=0;i--)
		{
			s3+=s2.charAt(i);
		}
		if(s3.equals(s5))
		{
			String s6=s+s4;
			System.out.println(s6);
		}
		else
		{
			System.out.println(s);
		}
	}
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		AssignQuestion a=new AssignQuestion();
		a.adding(s);
		
	}

}
