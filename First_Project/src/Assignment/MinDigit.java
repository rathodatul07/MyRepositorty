package Assignment;

import java.util.Scanner;

public class MinDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num=sc.nextInt();
		int Smallest_no=num%10;
		while(num>0)
		{
			
			if(num%10<Smallest_no)
			{
				Smallest_no=num%10;
			}
			num=num/10;
		}
		System.out.println("Min number are= "+Smallest_no);
		
	    

	}

}
