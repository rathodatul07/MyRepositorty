import java.util.Scanner;
public class WithdrawNotes {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter notes");
		int notes=sc.nextInt();
		
		int count2000=notes/2000;
		notes=notes%2000;
		System.out.println("notes of 2000*"+count2000);
		int count1000=notes/1000;
		notes=notes%1000;
		System.out.println("notes of 1000*"+count1000);
		int count500=notes/500;
		notes=notes%500;
		System.out.println("notes of 500*"+count500);
		int count200=notes/200;
		notes=notes%200;
		System.out.println("notes of 200*"+count200);
		int count100=notes/100;
		notes=notes%100;
		System.out.println("notes of 100*"+count100);
		int count50=notes/50;
		notes=notes%50;
		System.out.println("notes of 50*"+count50);
		int count20=notes/20;
		notes=notes%20;
		System.out.println("notes of 20*"+count20);
		int count10=notes/10;
		notes=notes%10;
		System.out.println("notes of 10*"+count10);
	}

}
