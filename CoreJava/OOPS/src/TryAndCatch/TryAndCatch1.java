package TryAndCatch;

public class TryAndCatch1 {
		public static void main(String[] args) {

			/*String[] s = new String[3];
			s[0] = "Ram";
			s[1] = "Shayam";
			try {
				for (int i = 10; i < s.length; i++) {
					System.out.println(s[i]);
				}
			}*/
			String s=null;
			try {
				for(int i=0; i<s.length(); i++)
					System.out.println(s);
				
				
			}
			 catch (StringIndexOutOfBoundsException e) {
					System.out.println("index out of bond : " + e.getMessage());
			 }
			catch (NullPointerException e) {
				System.out.println("not be Zero :" + e.getMessage());
				// e.printStackTrace();
			}
				// e.printStackTrace();
			 catch (Exception e) {
				System.out.println("last index jo h usme value do");
			}
		}

	}
