package Collection1;

import java.util.ArrayList;



public class ArrayOccurance {
	
	public void occurance(ArrayList<Integer> l)
	{
		
		
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i)==-1)
				continue;
			int count=1;
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i)==l.get(j))
				{
					count++;
					l.set(j, -1);
				}
			}
			System.out.println("elements are: "+l.get(i)+" occurance : "+count);
		}
		
	}

	public static void main(String[] args)
	{
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(67);
		l.add(34);
		l.add(67);
		l.add(23);
		l.add(34);
		l.add(78);
		l.add(34);
		System.out.println(l);
		ArrayOccurance a=new ArrayOccurance();
		a.occurance(l);
	
	}

}
