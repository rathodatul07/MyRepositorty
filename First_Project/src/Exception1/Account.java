package Exception1;
class InsufficientFundException extends RuntimeException
{
	
	public InsufficientFundException(String s)
	{
		super(s);
	}
}
public class Account 
{

	private int balance=3000;
	public int balance()
	{
		return balance;
	}
	
	public void withDraw(int amount)
	{
	
		if(amount>balance)
		{
			throw new InsufficientFundException("insufficient balance which is not acceptable ");			
		}
		balance=balance-amount;
	
		System.out.println("Total Balanve are:"+balance);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		System.out.println(a.balance());
		a.balance();
		try
		{
			a.withDraw(92000);
		}catch(InsufficientFundException e)
		{
			System.out.println("Thrown exception:"+e);
		}
		
	System.out.println(a.balance());
	System.out.println("Hello123");
	}

}
