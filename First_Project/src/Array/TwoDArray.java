package Array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray 
{
      public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element for row");
		//int row=sc.nextInt();
		System.out.println("enter element for col");
		//int col=sc.nextInt();
		//int a[][]=new int[row][col];
		int a[][]= {{1,2,3,6},{4,5,6,7},{6,4,5,8}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]);
			}
			System.out.println();
			
		}
		System.out.print(Arrays.toString(a));
		
		
	}

}
	
	


