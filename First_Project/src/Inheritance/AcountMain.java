package Inheritance;

public class AcountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount a=new SavingAccount();
		a.ShowAcceptDetail(4, 30000, "akas","SBIN0012234");
	Account.ifsc="Akashay00909";
		
		a.showSavingAccountDetail();
		a.depositAmount(5000f);
		a.withdrawAmount(30000f);
		a.openAccount();
		Account af=new SavingAccount();
		af.openAccount();
		Account a1=new SavingAccount();
		
		
}
}