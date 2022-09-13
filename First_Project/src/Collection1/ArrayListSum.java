package Collection1;

import java.util.ArrayList;

public class ArrayListSum {
	public void evenSum()
	{
		ArrayList<Integer> l=new ArrayList<>();
		l.add(34);
		l.add(35);
		l.add(36);
		l.add(37);
		int sum1=0;
		for(int i=0;i<l.size();i++)
		{
			
			if(l.get(i)%2==0)
			{
			sum1+=l.get(i);
			}
						
		}System.out.println(l);
		System.out.println(sum1);

	}
	

	public static void main(String[] args) {
		ArrayListSum a=new ArrayListSum();
		
		
		a.evenSum();
		//a.Arayadd1();
		
	}

}
