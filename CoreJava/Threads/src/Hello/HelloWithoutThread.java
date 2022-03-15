package Hello;
import java.util.*;

public class HelloWithoutThread {
		
	String name= null;
	
	public HelloWithoutThread(String threadName)
	{
		this.name=threadName;
	}
	
	public void jk()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println(i + name);
		}
	}
		
	}
