package Polymorphism1;

public class RealLifeExampleBank
{
public float rateOfInterest(float f)
{
	return f;
}
class SBI extends RealLifeExampleBank
{
	public float rateOfInterest(float f)
	{
		return f;
	}	
}

class ICICI extends RealLifeExampleBank
{
	public float rateOfInterest(float f)
	{
		return f;
	}	
}
	
class Axix extends RealLifeExampleBank
{
	public float rateOfInterest(float f)
	{
		return f;
	}	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealLifeExampleBank r=new RealLifeExampleBank();
		// SBI s=new SBI();
		r.rateOfInterest(67.8f);
		
		
	}

}
