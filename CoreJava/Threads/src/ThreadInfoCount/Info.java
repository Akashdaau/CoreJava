package ThreadInfoCount;

public class Info(String indent, ThreadGroup tg){
	int threadCount = tg.activeCount();
	Thread[] threads = new Thread[threadCount];
	tg.enumerate(threads);
	
	
	

}
