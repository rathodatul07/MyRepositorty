package StringAssignment;

public class ConvertUppetToLower {

	public static void main(String[] args) 
	{

		String s="ATULRATHODZ";
		char a[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
		if(s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			a[i]=(char)(a[i]+32);
		}
		System.out.print(a[i]);
		}
	}

}
