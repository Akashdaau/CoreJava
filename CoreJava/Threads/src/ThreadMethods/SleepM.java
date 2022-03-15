package ThreadMethods;

public class SleepM extends Thread{
		
		String name= null;
		//int m =34;
		
		public SleepM(String threadName)
		{
			name= threadName;
			
		}
		
		public void run()
		{
			
				       try {
				    	   for (int i= 0; i<=5; i++)
							{
						Thread.sleep(1000);
						 System.out.println(i + name);
							}
				       }
				catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.out.println(e);
					}
				      
		}
}

