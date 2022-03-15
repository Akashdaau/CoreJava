package ThreadMethods;

import Hello.HelloWithThread;

public class TestSleepM {
public static void main(String[] args) throws InterruptedException {
		
		HelloWithThread t = new HelloWithThread("Akash");
		HelloWithThread t1= new HelloWithThread("Aman");
		
		t.start();
		t1.start();

}
}
