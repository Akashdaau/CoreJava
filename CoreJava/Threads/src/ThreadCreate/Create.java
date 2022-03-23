package ThreadCreate;

public class Create extends Thread{
	public static void main(String[] args) {
		Create thread = new Create();
		thread.start();
		System.out.println("uiy");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		System.out.println("outside");
	}
	

}
