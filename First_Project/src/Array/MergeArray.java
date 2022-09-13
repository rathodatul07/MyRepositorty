package Array;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) 
	{
	int a[]= {2,4,6,7,8,9};
	int b[]= {11,12,13,14};
	int sizeA=a.length;
	int sizeB=b.length;
	int sizeC=sizeA+sizeB;
	System.out.println(a.length);
	int c[]=new int[sizeC];
	System.out.println(c.length);
	
	for(int i=0;i<a.length;i++)
	{
		c[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
	{
		c[a.length+i]=b[i];
		
	}
	for(int i=0;i<c.length;i++)
	{
		//System.out.print(c[i]+",");
		
	}
	
	System.out.print(Arrays.toString(c));
	
	
	}	

}
