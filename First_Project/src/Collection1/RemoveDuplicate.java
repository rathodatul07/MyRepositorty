package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public void prepare()
	{
		//ArrayExample a=new ArrayExample();
		ArrayList<Integer> l=new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(50);
		Iterator<Integer> itr=l.iterator();
		Iterator<Integer> itr1=l.iterator();
		System.out.println("Total Elements are:"+l.size());
		while(itr.hasNext())
		{

			Integer o=itr.next();
			if(itr.next().equals(itr1.next()))
			{
				itr1.remove();
			}

		}
		System.out.println(l);



		for(int i=0;i<l.size();i++)
		{
			for(int j=i+1;j<l.size();j++)
			{
				if(l.get(i).equals(l.get(j)))
				{ 
					l.remove(l.get(j)); } 

			}

		}System.out.println(l+"Elements are:"+l.size());

		System.out.println("Specified"+l.get(2));
		//remove by index
		System.out.println("remove"+l.remove(1));
		//remove by object
		System.out.println("Remove by object:"+l.remove(new Integer(2)));
		//remove using Iterator
		System.out.println(l);
		l.add(1);
		l.add(12);
		l.add(2);
		System.out.println(l);
		Iterator<Integer> itr4=l.iterator();
		while(itr4.hasNext())
		{
			if(itr4.next()==2)
			{
			itr4.remove();
			}
		}
		System.out.println(l);

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//	System.out.println(l);
		RemoveDuplicate r=new RemoveDuplicate();
		r.prepare();
	}

}
