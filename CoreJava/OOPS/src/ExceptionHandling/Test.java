package ExceptionHandling;

public class Test {

		public static void main(String[] args) throws LoginException {

			Test t = new Test();

			try {
				t.auth("a");
				System.out.println("equal hai");
			}
			catch (LoginException e) {
				System.out.println("equal nahi hai "+e.getMessage());
			}

		}

		public void auth(String name) throws LoginException {
			if ("ahhhh".equals(name)) {
				LoginException e=new LoginException();
				//throw e;
			}

}
}
		
