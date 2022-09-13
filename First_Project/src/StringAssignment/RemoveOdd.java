package StringAssignment;

    public class RemoveOdd {
	static String removeod(String s)
	{
		String newS=" ";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2==1)
			continue;
			newS+=s.charAt(i); 	
		}
		return newS;
	}

	public static void main(String[] args)
	{
        String s="abcdef";
		String s1=removeod(s);
		System.out.println(s1);
	}
}
