package app.pro;
import app.mob.MobileApplication;
public class ApllicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer("Ajay",5,"Core Java");
		//d.debugApp();
		//d.integrateCode();
		
		Application a=new Application(6.5f,"java",d);
		
		System.out.println(a);
		
		//a.uninstall();
		DesktopApplicatioin desc=new DesktopApplicatioin();
		desc.install();
		
		WebApplication wb=new WebApplication();
		wb.install();
		MobileApplication mb=new MobileApplication();
		System.out.println(mb);
	}

}
