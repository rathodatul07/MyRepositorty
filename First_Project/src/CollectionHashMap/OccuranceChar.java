package CollectionHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class OccuranceChar 
{
public void occurancechar1()
{
	String s="GooGle";
	HashMap<Character,Integer> m=new HashMap<>();
	for(int i=0;i<s.length();i++)
	{ 
		Integer val=m.getOrDefault(s.charAt(i), 0);
		m.put(s.charAt(i),val+1);
	}
	       System.out.println(m);
}
public void occurancechar2()
{
	String s="GooGle is";
	HashMap<Character,Integer> m1=new HashMap<>();
	for(int i=s.length()-1;i>=0;i--)
	{
		if(m1.containsKey(s.charAt(i)))
		{
			int count=m1.get(s.charAt(i));
			m1.put(s.charAt(i), ++count);
		}
		else
		{
			m1.put(s.charAt(i), 1);
		}
	}
	System.out.println(m1);
	//System.out.println(m1.containsKey(m1));
}
	public static void main(String[] args)
	
	{
		String s="atul frathso";
		HashMap<Character,Integer> m2=new HashMap<>();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			if(m2.containsKey(s.charAt(i)))
			{
				System.out.println("True");
			}
			else
			{
				System.out.println("false");
			}
		}
		
		OccuranceChar o=new OccuranceChar();
		o.occurancechar2();
	}
}
