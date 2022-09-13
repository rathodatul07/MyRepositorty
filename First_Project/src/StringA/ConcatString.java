package StringA;

public class ConcatString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Good";
		String str2="Morning";
		String str3="";
		
		
		for(int i=0;i<str1.length();i++)
		{
			str3+=str1.charAt(i);
			
		}
		for(int j=0;j<str2.length();j++)
		{
			str3+=str2.charAt(j);
		}
		System.out.println(str3);
	}

}
