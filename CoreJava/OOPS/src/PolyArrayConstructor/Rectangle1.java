package PolyArrayConstructor;

public class Rectangle1 extends Shape1 {
	private double length;
	private double breadth;
	
	public Rectangle1(double l, double b)
	{
		length=l;
		breadth=b;
		
	}
	
	public double area()
	{
		return length*breadth;
	}
	

}
