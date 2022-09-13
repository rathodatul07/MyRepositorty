package aTwoDArray;

import java.util.Scanner;

public class AcceptsArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element for row");
		int row=sc.nextInt();
		System.out.println("enter element for col");
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		
		for(int i=0;i<=row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=i;j<col;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	}

}
