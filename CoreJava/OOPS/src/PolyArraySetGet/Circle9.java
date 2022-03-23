package PolyArraySetGet;

public class Circle9 extends Shape9 {
	private double radius;
	private double PI;
	
	/*
	 * public Circle9() {
	 * 
	 * }
	 */
	
	public double area()
	{
		return(PI*radius*radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}
	


}
