package in.co.rays.basics;

public class AverageOfConsecutiveOddAndEven
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n[]= {2,4,91};
		int evenc=0; int oddc=0; int evensum=0; int oddsum=0;
		
		
		for(int i=0;i<=n.length;i++)
		{
			if(n[i]%2==0)
			{
				evenc++;
				evensum=evensum+i;
				//System.out.println(evensum);
			}
			else
			{
				oddc++;
				oddsum=oddsum+i;
				//System.out.println(oddsum);
			}
		}
		
		
		
		int evenavg=evensum/evenc;
		int oddavg=oddsum/oddc;
		
		System.out.println(evenavg);
		System.out.println(oddavg);

	}

}
