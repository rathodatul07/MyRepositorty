package Inheritance;

public class IPLMain {

	public static void main(String[] args) 
	{IPLTeam i=new IPLTeam();
	i=new RCB();
		
		i.play();
		i=new CSK();
		i.play();
		
		Member m1[]=new Member[2];
		m1[0]=new Member(101,"Rohit",136);
		m1[1]=new Member(102,"Dhoni",137);
		
		Team t=new Team();
		t.selectTeam();
		t.showTeam(m1);		
	}

}
