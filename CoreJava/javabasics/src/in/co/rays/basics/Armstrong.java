package in.co.rays.basics;

public class Armstrong {
	public static void main(String[] args) {
		int n=153;
		int a=n;
		int sum=0;
		
		while(n>0)
		{
			
			int r=n%10;
			
			int cube = r*r*r;
			sum = sum+cube;
			n=n/10;
			
			
		}
		if (sum==a)
		{
			System.out.println("Given  no. is armstrong");
		}
		else
			{
			System.out.println( "number is not");
			}
		
	}

}
