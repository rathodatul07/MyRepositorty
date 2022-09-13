package Array;

import java.util.Scanner;

public class WritenTestEvenFistFive
{
public void EvenNo(int arr[])
{
	
	
	System.out.println("Even Number are: ");
	for(int i=0;i<arr.length;i++)
	{
		if(i%2==0)
		{	System.out.print(arr[i]+",");
			if(i<=5)
			continue;
		
		}
		
	}
	
	
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr[4];i++)
		{
			System.out.println(arr[i]);
		}
		WritenTestEvenFistFive w=new WritenTestEvenFistFive();
		w.EvenNo(arr);
		
	}

}
