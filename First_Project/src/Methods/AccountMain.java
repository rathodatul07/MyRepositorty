package Methods;

public class AccountMain {

	public static void main(String[] args) 
	{
		Account a=new Account();
		a.openAcount(4067988, "Ajay", 340000);
		a.showAcountDetails();
		System.out.println( ".............deposit amount...........");
		a.depositAmount(5000);
		System.out.println( ".............withdraw amount...........");
		a.withdrawAmount(7000);
		System.out.println(s);
	}

}
