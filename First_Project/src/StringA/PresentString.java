package StringA;

import java.util.Scanner;

public class PresentString
{
	
	public String PresentChar(String s1)
	{ Scanner sc=new Scanner(System.in);
		int size=s1.length();
		char[] ch=s1.toCharArray();
		int count = 0;
		char c=sc.next().charAt(0);
       
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
		{
			if(ch[i]==ch[j])
			{		
				
				ch[i]=c;
				count++;
			}
			break;
		}System.out.println(ch[i]);
		}
		
		System.out.print(count);
		
		return s1;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.next();
		PresentString s3=new PresentString();
		//System.out.println("enter char to check present or not ");
		
		s3.PresentChar(s1);
	}
}
