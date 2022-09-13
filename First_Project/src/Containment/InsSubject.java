package Containment;

public class InsSubject {
	int id;
	String insname;
	String branch;
	Institute i;
	InsBranch b;
	InsSubject(int bid,String branchname,String bbranch,Institute ins,InsBranch ib)
	{
		id=bid;
		insname=branchname;
		branch=bbranch;
		i=ins;
		b=ib;
	}
	public String toString()
	{
		String str="\nid:"+id+"\ninsname:"+insname+"\nbranch"+branch+"institute:"+i+"InsBranch"+b;
		return str;
	}

}
