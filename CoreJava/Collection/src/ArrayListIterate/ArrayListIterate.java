package ArrayListIterate;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterate {
	public static void main(String[] args) {
	
	ArrayList l= new ArrayList();
	
	//l.add(1);
	l.add("akash");
	l.add(34);
	
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
		/*
		 * for(int i=0;i<=10 ; i++) { System.out.println(l); }
		 */	
	}
}
	
