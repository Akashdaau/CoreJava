package ExceptionHandling;

public class CatchTry {
	public static void main(String[] args) {
		int i=6;
		int j=2;
	try
	{
		int div = i/j;
		System.out.println(div);
	}
	catch(Exception e)
	{
		System.out.println("can't divide by zero");
	}
}
}
