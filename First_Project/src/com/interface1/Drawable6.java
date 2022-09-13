package com.interface1;

public interface Drawable6
{
void draw();

static int cube(int x)
{
	return x*x*x;
}
}
class Rectangle1 implements Drawable6
{
	public void draw()
	{
		System.out.println("Drawing RectangleA");
	}
}

