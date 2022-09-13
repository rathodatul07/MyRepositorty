package Collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class OntToFiftyEvenArrayList 
{
	
public void EvenNumber(ArrayList<Integer> al)
{
	ArrayList<Integer> al1=new ArrayList<>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
al.add(6);
al.add(7);
al.add(8);
al.add(9);
al.add(10);
al.add(11);
al.add(12);
al.add(13);
al.add(14);
al.add(15);
al.add(16);
al.add(17);
al.add(18);
al.add(19);
al.add(20);
al.add(21);
al.add(22);
al.add(23);
al.add(24);
al.add(25);
al.add(26);
al.add(27);
al.add(28);
al.add(29);
al.add(30);
System.out.println(al);

Iterator<Integer> itr=al.iterator();
while(itr.hasNext())
{
	if(itr.next()%2==1)
	{
		System.out.println(itr.next());
	}
}
for(int i=0;i<=50;i++)
{
	if(i%2==0)
	{
		al1.add(i);
	}
	
}System.out.println(al1);

}
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		OntToFiftyEvenArrayList o=new OntToFiftyEvenArrayList();
		o.EvenNumber(al);
	}

}
