package InnerClass1;
abstract class ClubHouse
{
	abstract public void conductGame();
}

interface Decorate
{
	void makeDecoration();
	void clubHouseReady();
}
public class Society1 
{
	int regNo;
	String ownerName,serveNo;


	Society1(int r,String o,String s)
	{
		regNo=r;
		ownerName=o;
		serveNo=s;
	}
	public String toString()
	{
		String str=regNo+" "+ownerName+" "+serveNo;
		return str;
	}
	public void showSocietyDetail()
	{
		System.out.println("Registration no are:"+regNo+"\nowner Name :"+ownerName);
	}
	
	public void enjoyEvent()
	{
		ClubHouse c=new ClubHouse()
				{
		public void conductGame()
		{
			System.out.println("condocted game");
		}
				};c.conductGame();
	}
	
	public void doTask()
	{
		Decorate d=new Decorate()
				{
		public void makeDecoration()
		{
			System.out.println("Make");
		}
		public void clubHouseReady()
		{
			System.out.println("ready");
		}
				};d.makeDecoration();d.clubHouseReady();
	}

	public class Flat
	{
		int flatId;
		String flatOwnName;
		String flatLocation;

		Flat(int f,String flat,String fl)
		{
			flatId=f;
			flatOwnName=flat;
			flatLocation=fl;
		}
		public void flatImfo()
		{

			System.out.println("flat id is:"+flatId);
			System.out.println("Flat location is :"+flatLocation);

		}
	}
	public static void main(String[] args) {
		Society1 s=new Society1(3,"rr","ee");
		s.enjoyEvent();
		s.doTask();
	}

}
