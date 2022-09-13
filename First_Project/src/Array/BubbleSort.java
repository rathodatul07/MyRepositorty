package Array;

import java.util.Arrays;

public class BubbleSort 
{
	 
public void BubbleSorting(int a[])
{
	System.out.println("array size :"+a.length);
	
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[i]<a[j+1])
			{
			int temp=a[j+1];
			a[j+1]=a[j];
			a[j]=temp;
			}
		
		}
	
	}
	
}
	public static void main(String[] args) 
	{
		
		
		  int a[]= {36,19,29,12,5};
		  BubbleSort b1=new BubbleSort();
		  b1.BubbleSorting(a);
        System.out.println(Arrays.toString(a));
		
	}

}
