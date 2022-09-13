package com.interface1;

public interface Drawable 
{
void draw();

}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}