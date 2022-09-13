package com.test3;

public class EvenFirst5 {
	
	public void show(int a[])
	{
		int count=0;
		System.out.println("Even number is :");
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				if(count==5)	
					continue;
				count++;	
				System.out.println(a[i]+" ");
			}
		}
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a[]= {3,2,7,10,15,18,20,74,21,56,23,88};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		EvenFirst5 e=new EvenFirst5();
		e.show(a);
	}

}
