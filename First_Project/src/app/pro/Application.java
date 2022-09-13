package app.pro;

public class Application
{
public float version;
public String tech;
Developer d;


public Application()
{
	tech="JAVA";
	version=4.1f;
}
public Application(float v,String t)
{
	version=v;
	tech=t;
}
public Application(float v,String t,Developer devl)
{
	version=v;
	tech=t;
	d=devl;
}
public String toString()
{
	String str="\nversion:"+version+"\ntechnology: "+tech+"\nDeveloper details: "+d;
	return str;
}

public void install()
{
	System.out.println("Instal The All Application in parents");
}
public void uninstall()
{
	System.out.println("Uninstal The All Application");
}

}

class DesktopApplicatioin extends Application
{
	DesktopApplicatioin()
	{
		super();
	}
	
	public void install()
	{
		System.out.println("Instal The All Application in child");
		System.out.println("instal the Software in desktop appln: "+tech);
		System.out.println("instal the version:"+version);
		
	}
}
class WebApplication extends Application
{
	WebApplication()
	{
		super();
	}
	public void install()
	{
		System.out.println("instal the software in web Applin:"+tech);
		System.out.println("instal the version in Web Application:"+version);
	}
}
