import java.util.Scanner;

public class AcceptQuantity {



	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter quantity ");
		int quanity=sc.nextInt();
		System.out.println("enter price are ");
		int price=sc.nextInt();
		double bill=quanity*price;


		if(bill>5000)
		{
			System.out.println("you get 5% discount");
			double discount =0.05*bill;
			System.out.println("discount are ="+discount);
			double total_bill=(bill-discount);
			System.out.println("total bills Are="+total_bill);

		}else 

			System.out.println("you dont get discount on this "+bill);

	}

}
