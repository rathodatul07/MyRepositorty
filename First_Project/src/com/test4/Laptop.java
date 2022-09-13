package com.test4;

public class Laptop
{
private String brand;
private double cost;

private OperatingSystem os;

Laptop(String bname,double cst,OperatingSystem ops)
{
	brand=bname;
	cost=cst;
	os=ops;
}
public String toString()
{
String str="\nBrand:"+brand+"\ncost:"+cost+" "+os;
return str;
}

public void setBrand(String bname)
{
	this.brand=bname;
}
public String getBrand()
{
	return brand;
}
public void setCost(double cst)
{
	this.cost=cst;
}
public double getCost()
{
	return cost;
}
public void setOs(OperatingSystem o)
{
	this.os=o;
}
public OperatingSystem getOs()
{
	return os;
}
}
