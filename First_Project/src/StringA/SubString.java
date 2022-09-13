package StringA;

public class SubString {

	public static void main(String[] args) {
		String str="Good Morning";
		String newstr="";
		int start=3;
		int end=10;
		for(int i=start;i<=end-1;i++)
		{
			newstr+=String.valueOf(str.charAt(i));	
		}
		System.out.println(newstr);
	}
}
