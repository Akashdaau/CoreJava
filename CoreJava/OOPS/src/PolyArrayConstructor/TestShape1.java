package PolyArrayConstructor;

public class TestShape1 {

	public static void main(String[] args) {
		Shape1[] s= new Shape1[2];
		s[1]=new Rectangle1(2,6);
		s[0]= new Circle1(8);
		
		double totalArea= calcArea(s);
		System.out.println(totalArea);
	}
	private static double calcArea(Shape1[] s)
	{
		double totalArea=0;
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i].area());
			totalArea= totalArea+s[i].area();
		}
		return totalArea;
	}

}
