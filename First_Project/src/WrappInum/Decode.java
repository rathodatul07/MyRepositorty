package WrappInum;

public class Decode {
	public void Third(String s)
	{
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int i1=c[i]+3;
			System.out.print((char)i1);
		}
	}
	public static void main(String[] args)
	{
		String s="sdjfsd";
		Decode d=new Decode();
		d.Third(s);
	}
}


