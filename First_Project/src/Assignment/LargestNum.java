package Assignment;

import java.util.Scanner;

public class LargestNum {
	
	public void large(int num)
	{
		int rem=0;
		int largestNo=0;
		while(num>0)
		{
		rem=num%10;
		if(largestNo<rem)
		{
			largestNo=rem;
		}
		num=num/10;
		}
		System.out.println("largest No are:"+largestNo);
	}
	public void smallestNumber(int num)
	{
	int rem=0;
	int smallNo=num%10;
	
	
	while(num>0)
	{
		if(num%10<smallNo)
		{
			smallNo=num%10;
			
		}
		num=num/10;
	}
	System.out.println("smallest No are:"+smallNo);
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		LargestNum l=new LargestNum();
		l.large(num);
		l.smallestNumber(num);
	}

}
