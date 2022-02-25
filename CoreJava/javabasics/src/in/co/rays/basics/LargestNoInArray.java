package in.co.rays.basics;

public class LargestNoInArray
{

	public static void main(String[] args) 
	{
		int[] numArray = { 1, 7, 3, 4, 5, 6, 20 };
	    int x = 0;
	    for (int i = 0; i < numArray.length; i++)
	    {
	      if (x < numArray[i])
	      {
	        x = numArray[i];
	      }

	    }
	    System.out.println(x + " Largest Array ");
	  }

}
