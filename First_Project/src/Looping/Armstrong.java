package Looping;

public class Armstrong 
{ 
	static int a=10;
	 public void m1()
	{
		System.out.println(a);
	}
public static void main(String[] args) 
{
int input=153;
int temp=input;
int sum=0;

while(input!=0)
{
	int reminder=input%10;
	sum=sum+(reminder*reminder*reminder);
	input=input/10;
}
if(sum==temp)
{
	System.out.println("this is armstrong ");
}
else
{
	System.out.println("this number is not armstrong");
}
}
}
