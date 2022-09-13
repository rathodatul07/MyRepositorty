package Exception1;
class TooYoungerException extends RuntimeException
{
	TooYoungerException(String i)
	{
		super(i);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
public class CustomExce {

	public static void main(String[] args) 
	{
	int age=62; 
	if(age>60)
	{
		throw new TooYoungerException("plz wait some more time");
	}
	else if(age<18)
	{
		throw new TooOldException("Your age is alrady crossed....!");
	}
	else
	{
		System.out.println("you will get detail by email....!");
	}

	}

}
