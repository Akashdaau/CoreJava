package in.co.rays.basics;

public class PalindromeString {
	String s="akash";
	String s1="";
	
	if(s.length()=0)
	{
		System.out.println("No string is given");
	}
	else
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			char c = s.charAt(i);
			s1=s1+c;
		}
		if(s1.equals(s))
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
	}

}
