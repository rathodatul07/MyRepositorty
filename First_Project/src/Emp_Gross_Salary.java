import java.util.Scanner;

public class Emp_Gross_Salary {

	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		double basic_Sal=sc.nextDouble(),gross_Sal,da,hra,emi=15000,profTax=200,deduction=profTax;
		
		hra=(35*basic_Sal)/100;
		System.out.println("hra are ="+hra);
		da=(25*basic_Sal)/100;
		System.out.println("da are ="+da);
		gross_Sal=basic_Sal+da+hra;
		System.out.println("gross_Sal Are="+gross_Sal);
	
		System.out.println("deduction are ="+deduction);
		double netPay=gross_Sal-deduction-emi;
		System.out.println("netPay are="+netPay);

	}

}
