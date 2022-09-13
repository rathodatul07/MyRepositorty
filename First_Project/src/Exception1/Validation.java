package Exception1;

import java.util.Scanner;
class AcceptMobileNumberException extends Exception
{
	public String getMessage()
	{
		return "This is not valid for mobile number";
	}
}
public class Validation 
{
	public void acceptMobileNumber(String num) throws AcceptMobileNumberException
	{
		if(num.matches("[0-9]{10}"))
		{
			System.out.println("number is valid");
		}
		
		else
		{
			throw new AcceptMobileNumberException();
		}
	}	
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("eneter number");
	String num=sc.next();
	Validation v=new Validation();
	try
	{
	v.acceptMobileNumber(num);
	}catch(AcceptMobileNumberException e)
	{
		System.out.println(e.getMessage());
	}	
}
}
