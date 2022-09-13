import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Chemistry");
			int chem=sc.nextInt();
			
			System.out.println("Biology");
			int bio=sc.nextInt();
			
			System.out.println("Phisycs");
			int phi=sc.nextInt();
		
			System.out.println("Mathematics");
			int math=sc.nextInt();
			
			System.out.println("Marathi");
			int mar=sc.nextInt();
			
			int total=chem+bio+phi+math+mar;
			System.out.println("total is ="+total);
			double per=(total*100)/500;
			
			System.out.println("per is ="+per);
			
			if(per<=90)
			{
				System.out.println(" ....Distinction with Grade is A+");
			}
			else if(per>=80 && per<90)
			{
				System.out.println("....Distinction with Grade is A");
			}
			else if(per>=60 && per<80)
			{
				System.out.println("....first Class with Grade is B+");
			}
			else if(per>=35 && per<60)
			{
				System.out.println("....Second Class with Grade is B");
			}
			else
			{
				System.out.println("You Have Fail.....! Sorry ");
			}
			

		}

	}

}
