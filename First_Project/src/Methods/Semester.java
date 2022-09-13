package Methods;

public class Semester
{
float m1,m2,m3;
int roll_no;
double per;

public void AcceptDetail()
{
	m1=13;
	m2=14;
	m3=15;
	roll_no=13;
	per=(m1+m2+m3)/3;
	
}
public void showDisplay()
{
	System.out.println("roll no are : "+roll_no);
	
	System.out.println(per);
}
}
