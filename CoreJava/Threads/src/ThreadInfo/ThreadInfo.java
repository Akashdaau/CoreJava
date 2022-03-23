package ThreadInfo;

public class ThreadInfo {
	
	public static void main(String[] args) {
		Thread t = new Thread("jj");
		
		log(" ", t);
		
		
	}
	public static void log(String indent, Thread t)
	{
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.isAlive());
		System.out.println(t.isDaemon());
		System.out.println(t.getState());
		System.out.println(t.getThreadGroup());
		
		
	}

}
