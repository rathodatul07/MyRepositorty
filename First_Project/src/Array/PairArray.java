package Array;

import java.util.Scanner;

public class PairArray {

	public static void main(String[] args)
	{

		int[] a= {2,4,3,4,5,6,7,8,3};
		System.out.println("Enter the number");
		
		Scanner sc=new Scanner (System.in);
		int no=sc.nextInt();
	
		String result="";
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;i++)
			{
				if(a[i]+a[j]==no)
				{
					result=a[i]+" "+a[j];
					System.out.println(result);
				}
				

			}
		}
	}

}
