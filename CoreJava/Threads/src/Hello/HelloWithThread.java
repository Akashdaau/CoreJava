package Hello;

public class HelloWithThread extends Thread{
	
	String name= null;
	
	public HelloWithThread(String threadName)
	{
		name= threadName;
		
	}
	
	public void run()
	{
		for (int i= 0; i<=5; i++)
				{
			        System.out.println(i + name);
				}
	}
	

}
