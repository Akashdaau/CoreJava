package in.co.rays.basics;

public class SumOfAllNumDivideBySum{

		public static void main(String[] args) {
			
			int i;
			int j=0;
			for(i=100; i<=200; i++)
			{
				
				if(i%7==0)
				{
					System.out.println(i);
					j=j+i;
					//System.out.println(j);
				
				}
				
			}
			System.out.println(j);
		}
}
