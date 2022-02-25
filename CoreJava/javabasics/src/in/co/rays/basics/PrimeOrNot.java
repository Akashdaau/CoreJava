package in.co.rays.basics;

public class PrimeOrNot {
	public static void main(String[] args) {
		int n = 7, i=2;
		if(n<i)
		{
			System.out.println("is not prime");
		}
		for (i=2; i<=n; i++)
		{
				{
					if(n==i)
					{
						System.out.println("is prime");
						break;
					}
				}
		if(n%i==0)	
		{
			System.out.println("is not prime");
			break;

		}
		else
		{
			System.out.println("is prime");
			break;
		}
		}

	}

}
