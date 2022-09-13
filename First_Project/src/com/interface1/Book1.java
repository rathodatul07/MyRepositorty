package com.interface1;

public class Book1 
{
int b_id;
String b_Name;
String a_Name;

Book1(int id,String bname,String aname)
{
	b_id=id;
	b_Name=bname;
	a_Name=aname;
}
public String toString()
{
	String str="\nbook id:"+b_id+"\nBook Name:"+b_Name+"\nAuther Name:"+a_Name;
	return str;
}
public void publish(String publication)
{
	System.out.println("publication:"+publication);
}
}
