package CollectionStack;

import java.util.Stack;

public class PalindromeStack {

	public static void main(String[] args)
	{
	String s="Abc2 dcba";
	Stack<Character> st=new Stack<Character>();
	
	for(int i=0;i<s.length();i++)
	{
		st.push(s.charAt(i));
	}
	String reverce="";
	
	while(st.isEmpty())
	{
		reverce=reverce+st.pop();
	}
	if(!st.equals(reverce))
	
		System.out.println("it is Palindrome");
	
	else
	
		System.out.println("it is not palindrome");
	
	}

}
