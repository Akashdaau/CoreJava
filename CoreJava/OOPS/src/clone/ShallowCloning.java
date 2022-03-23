package clone;

public class ShallowCloning implements Cloneable{
	public double balance;
	
	
	  public ShallowCloning(double d) { 
		  balance=d; }
	 

	
	  @Override protected Object clone() throws CloneNotSupportedException 
	  { 
		 
	  //TODO Auto-generated method stub 
		  return super.clone(); 
		  }
	 
	  
	public static void main(String[] args) throws CloneNotSupportedException {
		ShallowCloning s1= new ShallowCloning(678.99);
		ShallowCloning s2= (ShallowCloning) s1.clone();
		System.out.println(s1.balance);
		System.out.println(s2.balance);
		
	}
	

}
