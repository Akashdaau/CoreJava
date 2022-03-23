package Hashcd;

public class Marksheet {
	String name;
	int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	  public boolean equals(Object m2) {
	  
	  if(this.getName()==((Marksheet) m2).getName()) {
		  return true; 
	
		  }
	return false;
	  }
	  
	  public int hashcode(Object m2)
	  {
		if(this.hashCode()==m2.hashCode()) 
			{return name.hashCode();
			}
		return 0;
		
		
	  }
	  
		  
		 
		/*
		 * if (o==null) { return false; } if(!(o instanceof Marksheet)) { return false;
		 * }
		 */
		
		/* Marksheet m1= (Marksheet)m2;
		  return this==m2;*/
		 
}
