package StringAssignment;

public class CompareToString {

	public static void main(String[] args)
	{
	String s1="Atul";	
	String s2="Atul";
	String s3="Ajit";
	//not done
	for(int i=0;i<=s1.length();i++)
	{
		int count = 0;
		for(int j=i+1;j<=s2.length();j++)
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	}

}
