package com.test4;

public class OperatingSystem 
{
	private String osName,vendor;
	private float version;

OperatingSystem()
{
	osName="Wndows 10";
	vendor="HP";
	version=10.1f;
}

OperatingSystem(String os,String vname,float ver)
{
	this.osName=os;
	this.vendor=vname;
	this.version=ver;
}
public String toString()
{
	String str ="\nOperating System: "+osName+"\nvendor Name: "+vendor+"\nversion: "+version;
	return str;
}

public void setOsName(String os)
{
	this.osName=os;
}
public String getOsname()
{
	return osName;
}

public void setVendor(String vname)
{
	this.vendor=vname;
}
public String getVendor()
{
	return vendor;
}
public void setVersion(float ver)
{
	this.version=ver;
}
public float getVersion()
{
	return version;
}

}
