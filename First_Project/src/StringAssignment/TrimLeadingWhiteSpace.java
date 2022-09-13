package StringAssignment;

public class TrimLeadingWhiteSpace {

	public static void main(String[] args)
	{

		String s="  India is my country";
		char c[]=s.toCharArray();
		
	
		String s1=" ";
		char ch[]=s1.toCharArray();
		for(int i=0;i<=c.length-1;i++)
		{
			if(c[i]==' ')
			{
				s1+=s.trim();
			}
		
		}System.out.println(s1);
		
		
	}

}
