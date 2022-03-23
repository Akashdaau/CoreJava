package Compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCompt {

	public static void main(String[] args) throws Exception
	{
		ArrayList<Compt> l=new ArrayList<Compt>();
		
		l.add(new Compt("akash", 21, "indore"));
		l.add(new Compt("akash", 21, "indore"));
		
		for(int i=0; i<=l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		Collections.sort(l, new Compt());
	}
	
	
}