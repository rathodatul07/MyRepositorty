package Collection1;

import java.util.ArrayList;

public class AddEvenNo {

	public void addEle()
	{
		ArrayList<Integer> l=new ArrayList<>();
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			{
				l.add(i);
			}
		}
		System.out.println(l);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddEvenNo a=new AddEvenNo();
		a.addEle();
	
	}

}
