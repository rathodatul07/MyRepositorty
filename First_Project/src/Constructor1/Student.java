package Constructor1;

public class Student 
{
	int roll_no;
	String name,address;
	double mo_no;
	double pan_no;
	static String collegeName="TPCT";
	
	Student()
	{
		roll_no=1;
		name="Ajay";
		address="Latur";
		mo_no=986087658;
		
		System.out.println(Student.collegeName);
		System.out.println("roll_no are:"+roll_no);
		System.out.println("name are:"+name);
		System.out.println("address are:"+address);
		System.out.println("mo_no are:"+mo_no);
	}
	Student(int roll_no,String name,String address,double mo_no)
	{
		
		this.roll_no=roll_no;
		this.name=name;
		this.address=address;
		this.mo_no=mo_no;
		
	
		
	}
	static void display2()
	{
		
		System.out.println("this is static method");
	}
	Student(int roll_no,String name,String address,double mo_no,double pan_no)
	{
		this.pan_no=pan_no;
	}
    Student(int roll_no)
	{
      this.roll_no=roll_no;
	}
	public void disply()
	{
		this.pan_no=pan_no;
		System.out.println("roll_no are:"+roll_no);
		System.out.println("name are:"+name);
		System.out.println("address are:"+address);
		System.out.println("mo_no are:"+mo_no); 
		System.out.println("Pan No are:"+pan_no);	
	}
	
}