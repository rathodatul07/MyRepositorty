package Array;

import java.util.Arrays;

import pack1.com.A;

public class Adding5Element {

	public static void main(String[] args)
	{
		int arr[]= {2,3,5,7,8};
		int size=arr.length;
		
		int newArr[]=new int[size+3];
		int  value= 7;
		System.out.println(newArr.length);
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(newArr));
		
		for(int i=0;i<=arr.length-1;i++)
		{
			newArr[i]=arr[i];
		}
		newArr[size]=value;
		System.out.println(Arrays.toString(newArr));
	}

}