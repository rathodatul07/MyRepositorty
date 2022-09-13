package Looping;

public class palindrome {

	public static void main(String[] args) 
	{
int	input=1234321;
	int temp=input;
	int sum=0;
	
	while(input>0)
	{
		int remindor=input%10;
		sum=(sum*10)+remindor;
		input=input/10;
	}
	if(temp==sum)
	{
		System.out.println("this is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
	}

}
