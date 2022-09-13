package StringAssignment;

public class RemoveAllOccurance {

	public static void main(String[] args)
	{
		String s="AtulRathod";
		//System.out.println("a");
		char c[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++)
		{
			if(c[i]!=s.charAt(i))
			{
			continue;
			 
			}	
			System.out.print(c[i]);
		}	
	}
}
