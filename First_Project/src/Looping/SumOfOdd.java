package Looping;

public class SumOfOdd {

	public static void main(String[] args) {
		int count=0;
		int n=20;
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				sum=sum+i;
				count++;
			}
		}
		System.out.println("sum of odd ="+sum);

	}

}
