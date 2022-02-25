package in.co.rays.basics;

public class Palindrome {
	public static void main(String[] args) {
		int i=212;
		int j=i;
		int r=0;
		int reverse=0;
		
		while(i>0)
		{
			r=i%10;
			reverse=reverse*10+(r);
			//System.out.println(reverse);
			i=i/10;
		}
		if(j==reverse)
		{
			System.out.println("No. is palindrome");
		}
		else
		{
			System.out.println("No. is not palindrome");
		}
	}

}
