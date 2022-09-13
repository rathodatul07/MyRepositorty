
public class BankAccount
{
String Bank_Name;
int Acc_no;
double balance;

public void acceptData(String Bank_Name,int Acc_no,double balance)
{
	this.Bank_Name=Bank_Name;
	this.Acc_no=Acc_no;
	this.balance=balance;
	
}
public void deposit(double amt)
{
	balance=balance+amt;
	System.out.println("Amount Deposited:"+balance);
}
public void withDraw(double amt)
{
	balance=balance-amt;
	System.out.println("Amount Withdraw:"+balance);
}
public void GetBalance()
{
	System.out.println("Remaining Balance are:"+balance);
}
public static void main(String[] args) 
{
	BankAccount b=new BankAccount();
	b.acceptData("SBI", 2345678, 50000);
	b.deposit(90000);
	b.withDraw(80000);
	b.GetBalance();
}
}
