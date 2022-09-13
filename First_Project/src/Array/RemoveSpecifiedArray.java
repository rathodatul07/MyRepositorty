package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveSpecifiedArray {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int a[]=new int[size];

		for(int i=0;i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		System.out.println("eneter the removed element");
		int b=sc.nextInt();
		 
		for(int i=0;i<=a.length-1;i++)
		{
		if(	a[i]==b)
			
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			break;
		}
		
		}
		System.out.println("aftes deletion");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
