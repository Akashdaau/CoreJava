package Cloning;

public class DeepCloning {
		int x=50;   
		public static void main(String args[])   
		{  
	
		DeepCloning obj1 = new DeepCloning();  
		DeepCloning obj2 = new DeepCloning();  
	 
		//ShallowCloning obj2 = obj1;  
		   
		obj1.x =8;  
		     
		System.out.println("The value of x is: " + obj2.x);  
		} 
	}

