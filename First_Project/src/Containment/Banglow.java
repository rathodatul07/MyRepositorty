package Containment;

public class Banglow
{
String ban_Name,b_OwnerName;
double area;
Outhouse ohouse;

Banglow(String bname,String boName,double barea,Outhouse o)
{
	ban_Name=bname;
	b_OwnerName=boName;
	area=barea;
	
	ohouse=o;
	
}
public String toString()
{
	String str1="\nban_Name:"+ban_Name+"\nb_OwnerName:"+b_OwnerName+"\narea:"+area+ohouse;
    return str1;
}

}
