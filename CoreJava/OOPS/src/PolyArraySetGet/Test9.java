package PolyArraySetGet;

public class Test9 {
	
	public static void main(String[] args) {
		
		Shape9 s[] = new Shape9[1];
		Circle9 c=new Circle9();
		
		s[0] = c;
		
		c.setRadius(2);
		c.getRadius();
		
		c.setPI(3.14);
		c.getPI();
		
		System.out.println(s[0].area());
		
		
		
		
		
		
		
		
		
		
	
	}

}
