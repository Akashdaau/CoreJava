package ForEach;

import java.util.ArrayList;

public class ForEachEx {
	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		
		l.add(12);
		l.add("akash");
		l.add("jkk");
		l.add("akshay");
		
		l.forEach(li-> System.out.println(l));
		
		
		 for( Object n: l)
		 {
			 System.out.println(n);
		 }
		
	}

}
