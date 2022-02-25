package in.co.rays.basics;

public class Armstrong {
	public static void main(String[] args) {
		int n=23;
		int sum=0;
		
		while(n>0)
		{
			
			int r=n%10;
			n=n/10;
			int rem = r*r*r;
			sum = sum+rem;
			
			System.out.println(sum);
		}
	}

}
