package Array;

import java.util.Arrays;

public class EnhanceForLoop1 {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3,6},{1,2,3,6}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int arr[]: a)
		{
			System.out.print(arr);
			
		}
		System.out.println();
		
	}
	
}
