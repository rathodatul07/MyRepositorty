package Containment;

public class MarketMain {

	public static void main(String[] args) 
	{
		Shop s=new Shop("atul","ajay",9.9);
		Market m=new Market("akshay",7.8,s);
		System.out.println(m);
	}

}
