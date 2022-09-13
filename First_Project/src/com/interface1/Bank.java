package com.interface1;

public interface Bank
{
float rateOfInterest();

}

class SBI implements Bank
{
	public float rateOfInterest()
	{
		return 9.15f;
	}
}

class PNB implements Bank
{
	public float rateOfInterest()
	{
		return 9.17f;
	}
}
