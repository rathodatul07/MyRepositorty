package Array;

import java.util.Arrays;

public class SelectionSort 
{
	public void SelectSort(int a[])
	{int minindx=0;
		for(int i=0;i<a.length-1;i++)
		{
			
			 minindx=i;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[minindx])
				{
				minindx=j;
				}
			}
		
		int temp=a[minindx];
		a[minindx]=a[i];
		a[i]=temp;
		}
	}

	public static void main(String[] args) 
	{
		int a[]= {5,12,29,19};
		SelectionSort s=new SelectionSort();
		s.SelectSort(a);
		System.out.println(Arrays.toString(a));
	}

}
