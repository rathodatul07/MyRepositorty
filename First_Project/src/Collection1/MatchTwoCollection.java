package Collection1;

import java.util.ArrayList;

public class MatchTwoCollection
{
	public void matchCollection()
	{
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		System.out.println(al1);		
		
		ArrayList<Integer> al2=new ArrayList<>();
	    
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		System.out.println(al2);
		/*for(int i=0;i<=al2.size();i++)
	{
	if(al1.get(i)==al2.get(i))
	{
		System.out.println("collection is matched");
	}
	else
	{
		System.out.println("collection does not matched");
	}
	}*/
		if(al1.equals(al2) )
		{
			System.out.println("collection is matched");
		}
		else
		{
			System.out.println("collection does not matched");
		}

	}
	public static void main(String[] args) {

		MatchTwoCollection mc=new MatchTwoCollection();
		mc.matchCollection();
	}

}
