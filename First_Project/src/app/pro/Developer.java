package app.pro;

public class Developer
{

	String devName;
	float devExper;
	String devSkill;
	Developer(String dname,float exp,String sk)
	{
		devName=dname;
		devExper=exp;
		devSkill=sk;
	}
	public String toString()
	{
		String str="\ndeveloper Name: "+devName+"\ndeveloper Experiance: "+devExper+"\ndeveloper Skills:"+devSkill;
	     return str;
	}
	public void debugApp()
	{
		System.out.println("Debug App");
	}
	public void integrateCode()
	{
		System.out.println("Integrated Code");
	}
}
