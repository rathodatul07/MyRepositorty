package Containment;

public class Shop 
{
String shopName,sOwnerName;
double shopArea;

Shop(String sname,String owner,double area)
{
	shopName=sname;
	sOwnerName=owner;
	shopArea=area;
}
public String toString()
{
	String str1="\n Shop Name:"+shopName+"\nShop Owner Name:"+sOwnerName+"\nArea:"+shopArea;
    return str1;
}



}
