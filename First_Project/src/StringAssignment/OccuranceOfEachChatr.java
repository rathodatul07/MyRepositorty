package StringAssignment;

public class OccuranceOfEachChatr {

	public static void main(String[] args)
	{
	String s="welcome india welcome";
	char c[]=s.toCharArray();
	//String ch[]=s.split("");
	for(int i=0;i<c.length;i++)
	{
		if(c[i]=='0')
		continue;
		int count=1;
		for(int j=i+1;j<s.length();j++)
		{
			if(c[i]==c[j])
			{
				
				count++;
				c[j]='0';
				
			}
		}
		System.out.println(c[i]+" ="+count);
	}

	}

}
