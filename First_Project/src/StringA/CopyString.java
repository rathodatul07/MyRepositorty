package StringA;

public class CopyString {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Atul";
		for(int i=0;i<s1.length();i++)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);

	}

}
