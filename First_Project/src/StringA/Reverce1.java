package StringA;

import java.util.Scanner;

public class Reverce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
String s="Deepak";
String s2="";

for(int i=s.length()-1;i>=0;i--)
{
	s2=s2+s.charAt(i);
	
}
System.out.println(s2);
	}

}
