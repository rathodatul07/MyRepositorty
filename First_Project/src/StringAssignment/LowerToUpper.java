package StringAssignment;

public class LowerToUpper {

	public static void main(String[] args) {
		String s="atulAjay AKSHAT";
		
		char a[]=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(a[i]>='a'&& a[i]<='z')
			{
				a[i]=(char) (a[i]-32);
			}
			System.out.print(a[i]);
		}
	}
}
