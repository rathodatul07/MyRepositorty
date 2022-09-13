import java.util.Scanner;

public class Aggregate {

	public static void main(String[] args)
	{

   Scanner sc=new Scanner (System.in);
   System.out.println("enter first number");
   double a=sc.nextDouble();
   System.out.println("enter second number");
	double b=sc.nextDouble();
	
	System.out.println("addition are= "+a+b);
	System.out.println("substraction are= "+(a-b));
	System.out.println("multiplication are ="+(a*b));
	System.out.println("dividion are ="+(a/b));
	}

}
