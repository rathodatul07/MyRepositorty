package Methods;

public class Student
{
int roll_No;
String name;
float marks1,marks2;
double per;

public void acceptDetails(int r_No,String s_name,float phy,float chem)
{
	roll_No=r_No;
	name=s_name;
	marks1=phy;
	marks2=chem;
 per=(phy+chem)/2;
}
public void showDetails()
{
	System.out.println("Student Roll No are : "+ roll_No+" Student name are: "  +name+" Students first subjects Marks Are:  "+marks1+"  Students first subjects marks are:  "+marks2+"percentage are: "+per);
}
}
 