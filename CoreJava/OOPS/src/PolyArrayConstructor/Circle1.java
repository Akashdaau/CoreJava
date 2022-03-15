package PolyArrayConstructor;

public class Circle1 extends Shape1 {
	public double radius;
	
	public Circle1(double r)
	{
		this.radius=r;
	}
	public double area()
	{
		return 3.14*radius*radius;
	}
	

}
