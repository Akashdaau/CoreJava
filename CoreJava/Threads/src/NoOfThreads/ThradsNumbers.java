package NoOfThreads;

import java.lang.management.ManagementFactory;

public class ThradsNumbers {
	public static void main(String[] args) {
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(ManagementFactory.getThreadMXBean().getThreadCount());
	}

}

