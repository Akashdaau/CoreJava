package in.co.rays.basics;

public class ReverseDigitsOfNumber {
	public static void main(String[] args) {
		int n=12345;
		
		while(n>0)
		{
			int r=n%10;
			n=n/10;
			
			System.out.println(r);
		}
	}

}
