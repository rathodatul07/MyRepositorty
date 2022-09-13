package Inheritance;

public class IPLTeam 
{
public void play()
{
	System.out.println("Players Playing");
}
}

class CSK extends IPLTeam
{
	public void play()
	{
		System.out.println("Players Playing from CSK Team");
	}
}
class RCB extends IPLTeam
{
	
	public void play()
	{
		System.out.println("Players Playing from RCB Team");
	}
}

class Member extends IPLTeam
{
	int mid;
	String mname;
	int no_of_Match;
	Member(int mid,String mname,int no_of_Match)
	{
		this.mid=mid;
		this.mname=mname;
		this.no_of_Match=no_of_Match;
		
	}
	public String toString()
	{
		String str="Member id:"+mid+"\nMember Name:"+mname+"\nNumber of matches:"+no_of_Match;
		return str;
	}
}

class Team extends IPLTeam
{
	String tName;
	int noOfPlayer;
	String Owner;
	Member[] mbs;
	
	Team()
	{
		tName="Csk";
		noOfPlayer=11;
		Owner="Ambani";		
	}
	public void selectTeam()
	{
		System.out.println("You have selected ......!"+tName);
	}
	public void showTeam(Member mbs[])
	{
		for(Member m:mbs)
		{
			System.out.println(m);
		}
		System.out.println("Team Name"+tName);
		System.out.println("Player"+noOfPlayer);
		System.out.println("Owner"+Owner);
	}
}

