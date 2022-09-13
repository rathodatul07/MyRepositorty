import java.util.Scanner;

public class ArrayAssignment {
	
	public void average(int a[])
	{
		int sum=0;
		float avg=0.0f;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			count++;
		}
		avg=sum/count;
		System.out.println("Average are:"+avg);
	}

	
}
