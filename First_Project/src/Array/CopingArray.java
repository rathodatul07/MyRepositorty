package Array;

import java.util.Scanner;

public class CopingArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	//	int size=sc.nextInt();
		//int a[]=new int[size];
		int a[]= {2,3,4,5,6};
		int a1[]=new int[a.length];
		//for(int i=0;i<=a.length-1;i++)
			
		//{
			//a[i]=sc.nextInt();	
			
		//}
		System.out.println("coping..... array.!.it will be show");
		for(int i=0;i<=a.length-1;i++)
		{
			a1[i]=a[i];
		}
		System.out.println("first array");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(+a[i]);
		}
		System.out.println();
		System.out.println("copied array");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.print(a1[i]);
		}
		
		
		
	}

}
