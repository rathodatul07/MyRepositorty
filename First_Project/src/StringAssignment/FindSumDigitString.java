package StringAssignment;

import java.awt.font.NumericShaper;

public class FindSumDigitString 
{
public void sum()
{
 String s="2b34j44hdg8";
 int sum1=0;
 int temp;
 char ch[]=s.toCharArray();
 for(int i=0;i<=s.length()-1;i++)
 {	
	if(Character.isDigit(ch[i]))
	{
		if(ch[i]%2==0) 
		{
			sum1=sum1+Character.getNumericValue(ch[i]);
		//	sum1=sum1+Character.getNumericValue(ch[i]);//first method
		//	sum1+=Integer.parseInt(String.valueOf(s.charAt(i)));//second method
		}
	}
 } 
 System.out.println(sum1);

}
public static void main(String[] args)
{
FindSumDigitString s=new FindSumDigitString();
s.sum();

}
}
