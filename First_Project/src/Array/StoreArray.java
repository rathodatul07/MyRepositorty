package Array;

import java.util.Scanner;

public class StoreArray {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
		
		//int size=sc.nextInt();
		int arr[]= {7,5,7,6,5,6,5,3};
		//int a[]=new int[size];
		System.out.println(arr.length);
	int sum=0;
	for(int i=1;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr.length-1;j++)
		{
			int count=1;
			if(arr[i]==arr[j])
			{
				count++;
			}
		
		}
	}
		
		
	}

}
