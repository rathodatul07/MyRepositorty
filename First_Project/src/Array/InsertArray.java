package Array;

import java.util.Arrays;

public class InsertArray {

	public static void main(String[] args) {
	int arr[]= {10,20,30,40,50};
	
	System.out.println(Arrays.toString(arr));
	
	int pos=3;
	int element=100;
	for(int i=arr.length-1;i>=pos-1;i--)
	{
		arr[i]=arr[i];
	}
	arr[pos-1]=element;
for(int i=0;i<arr.length;i++)
{
	System.out.println(arr[i]);
}
	}

}
