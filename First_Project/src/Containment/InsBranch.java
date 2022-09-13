package Containment;

public class InsBranch 
{
	int id;
	String insname;
	String branch;
	Institute i;
	InsBranch(int bid,String branchname,String bbranch,Institute ins)
	{
		id=bid;
		insname=branchname;
		branch=bbranch;
		i=ins;
	}
	public String toString()
	{
		String str="\nid:"+id+"\ninsname:"+insname+"\nbranch"+branch+"institute:"+i;
		return str; 
	}
}
