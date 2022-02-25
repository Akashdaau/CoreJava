package in.co.rays.basics;

public class TableArray {
	
		public static void main(String[] args)
		{

			int a[][] = new int[10][10];

			for (int i = 1; i <10; i++)
			{
				
				

				for (int j = 2; j <= 10; j++)
				{
					
					int m = i*j;
					System.out.print(m +" ");
					//System.out.print(j+"*"+i+"="+m+" ");
				}
				System.out.println(" ");
			}

		}
}