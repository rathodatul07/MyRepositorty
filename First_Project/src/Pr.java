
public class Pr 
{
public void m2(int num)
{
	int count=0;
	int i=1;
	String prr="";
	for(i=1;i<=num;i++)
	{
		if(num%i==0)
		{	
		count++;
		}
	}
	if(count==2)
	{
		prr+=i+" ";
	}
	System.out.println(prr);
	}
public void m4(String s)
{
	String s2="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s2=s2+s.charAt(i);
	}
	if(s.equals(s2))
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("not");
	}
}

	public static void main(String[] args) {
		
		
		int num=100;
		Pr p=new Pr();
		
		
		String s="abcdcba";
		p.m4(s);

}
}
