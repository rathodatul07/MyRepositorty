import java.util.Scanner;

public class FactorNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=18;
		int b=9;
		
		if(a%b==0)
		{
			System.out.println(b+" is factor of "+a);
		}
		else
		{
			System.out.println(b+" is not factor is"+a);
		}
		
		int n=9;
		int j=1;
		while(n>0)
		{
			if(n%j==0)
			{
				System.out.println(j);
			}
			
			
			j++;
			
		}
		
	}

}
