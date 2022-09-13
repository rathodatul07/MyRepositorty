package StringA;
import java.util.Scanner;

public class Occurance
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("enter string:");
		s=sc.nextLine();
	
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			
			if(c[i]=='0')//1
				continue;//2
			int cnt=1;
			for(int j=i+1;j<c.length;j++) 
			{
				if(c[i]==c[j]) 
				{
					cnt++;	
					c[j]='0';//3
					
				}  

			}
			System.out.println("occurance of "+c[i]+"="+cnt);
			
		}

	}

}
