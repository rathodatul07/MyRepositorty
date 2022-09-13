package StringAssignment;

public class Cocatinate {

	public static void main(String[] args) {
		String s1="Akshay";
		String s2="SAchin";
		String s3="";	
		//System.out.println(s1.concat(s2)); //using method concat
		//without method concat
		for(int i=0;i<s1.length();i++)
		{
			s3=s3+s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			s3=s3+s2.charAt(i);
		}
		System.out.println(s3);

	}

}
