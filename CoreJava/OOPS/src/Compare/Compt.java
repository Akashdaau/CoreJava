package Compare;

import java.util.Comparator;

public class Compt implements Comparator<Compt>{
	public String name;
	public int roll;
	public String address;
	
	public Compt()
	{
		
	}
	public Compt(String name, int roll, String address)
	{
		this.name=name;
		this.roll=roll;
		this.address=address;
	}
	
	public int getRoll(){
		return roll;
		
	}
	
	
	
	/*
	 * public int compare(Compt a, Compt b) { return a.roll-b.roll; }
	 */
	
	/*
	 * public int compare(Compt a, Compt b,Compt c) { return
	 * a.name.compareTo(b.name); }
	 */

	@Override
	public int compare(Compt o1, Compt o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	

	
	
	

}
