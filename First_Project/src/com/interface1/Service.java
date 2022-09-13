package com.interface1;

public interface Service 
{
void provideService(String f);
}

class TransportSer implements Service
{
	public void provideService(String s)
	{
		System.out.println("transport services is good"+s);
	}
}
class Courier implements Service
{
	public void provideService(String s)
	{
		System.out.println("courier Service is good"+s);
	}
}
