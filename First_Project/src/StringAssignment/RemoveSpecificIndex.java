package StringAssignment;

import java.util.Scanner;

public class RemoveSpecificIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String s=sc.next();
	
		System.out.println("enter specific index");
		char c=sc.next().charAt(0);
		int count=0;
		String newS=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			continue;
			newS+=s.charAt(i); 		
		}
		System.out.println(newS);
	}

}
