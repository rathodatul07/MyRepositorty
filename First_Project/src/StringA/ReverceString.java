package StringA;

import java.util.Scanner;

public class ReverceString
{
public String Reverce(String s1)
{
	int size=s1.length();
	char ch[]=s1.toCharArray();
	int first=0;
	int last=size-1;
	while(first<last)
	{
		char temp=ch[first];
		ch[first]=ch[last];
		ch[last]=temp;
		first  ++;
		last--;
	}
	for(int i=0;i<ch.length;i++)
	{
		System.out.print(ch[i]);
	}
	return s1;
	

}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.next();
		ReverceString r=new ReverceString();
		r.Reverce(s1);
	}

}
