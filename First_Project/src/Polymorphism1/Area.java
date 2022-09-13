package Polymorphism1;

public class Area 
{
	
public void calculateArea(float a)
{   
	float p=10,r=18;
	float areaofCircle=p*r*r;
	System.out.println("areaofCircle :"+areaofCircle);
}

public void calculateArea(int w,int h)
{
	int rectangle=w+h;
	System.out.println("rectangle:"+rectangle);
}
public void calculateArea(float b,int h)
{
	float triangle=(b/h)/2;
	System.out.println("triangle"+triangle);
}


	}

