package Containment;

public class PerMain {
//person address main...think half
	public static void main(String[] args) 
	{
		Person p=new Person("Atul","male","pune",25);
		p.setName("Atul");
		p.setGender("Male");
		p.setAddress("Osmanabad");
		p.setAge(25);
		
		System.out.println(p);
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getAddress());
		System.out.println(p.getAge());
		Address a=new Address();
		a.setp(p);
		System.out.println(a);
	}

}
