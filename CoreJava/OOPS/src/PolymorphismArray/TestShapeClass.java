package PolymorphismArray;

public class TestShapeClass
{

	public static void main(String[] args)
	{
		ShapeClass s[]=new ShapeClass[2];
		s[0]=new Circle();
		s[1]=new Triangle();
		
		double totalArea = calcArea(s);
				System.out.println(totalArea);
	}
	public static double calcArea(ShapeClass[] s)
	{
		double totalArea=0;
		
		for(int i=0; i<s.length; i++)
		{
			totalArea+=s[i].area();
			
		}
		return totalArea;
	}
}