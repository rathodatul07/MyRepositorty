package Inheritance;

public class Account
{

	int accId;
	float balance;
	String custName;
	static String ifsc="SBIN001244";
	
	
	Account()
	{
		System.out.println("default constructor of parent");
		
	}
	
	Account(String acustName,float abalance)
	{
		System.out.println("parametrised cons of parent");
		custName=acustName;
		balance=abalance;
		
	}
	public void openAccount()
	{
		System.out.println("open Account parents class");
	}
	public void ShowAcceptDetail(int aId,float abalance,String acustName,String ifs)
	{
		accId=aId;
		balance=abalance;
		custName=acustName;
		
		System.out.println("\nAccount Id"+accId+"\nbalance:"+balance+"\ncustemer Name:"+custName+"\nIFSC:"+ifsc);
		Account.ifsc="Ktk98765";
	
	}
}
class SavingAccount extends Account
{
	
	float iRate;
	SavingAccount()
	{
		super();
		iRate=5.5f;
	}
	public void openAccount()
	{
		System.out.println("open Account child class");
	}
	SavingAccount(float ir,int aId,float abalance,String acustName)
	{
		super(acustName,abalance);
		iRate=ir;
		
		accId=aId;
		
		
	}
	public void showSavingAccountDetail()
	{
		System.out.println("\nRate are:"+iRate+"\naccount Id: "+accId+"\nbalance are:"+balance+"\ncustmer name : "+custName);
	}
	public void depositAmount(float amt)
	{
		balance=balance+amt;
		System.out.println("total balance are:"+balance);
	}
	public void withdrawAmount(float amt)
	{
		balance=balance-amt;
		System.out.println("remaining balance:"+balance);
	}
}