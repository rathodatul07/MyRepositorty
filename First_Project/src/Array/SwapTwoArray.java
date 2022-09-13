package Array;

import java.util.Arrays;

public class SwapTwoArray {

	public static void main(String[] args) 
	{

		int a[]= {2,3,4,5};
		int b[]= {9,8,7,5};
		
		for(int i=0;i<a.length;i++)
		{			
			
				int swap=a[i];
				a[i]=b[i];
				b[i]=swap;
					
		
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println (a[i]);	
		}
		System.out.print(Arrays.toString(a));
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
			
		}
		System.out.print("swapping a to b"+Arrays.toString(b));
		}
		
		
	}


