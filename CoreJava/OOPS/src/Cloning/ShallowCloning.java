package Cloning;

public class ShallowCloning {
	int x=50;   
	public static void main(String args[])   
	{  
	// creating an object of the class  
	ShallowCloning obj1 = new ShallowCloning();  
	  
	// it will copy the reference, not value  
	ShallowCloning obj2 = obj1;  
	  
	// updating the value to 6   
	// using the reference variable obj2  
	//obj1.x =8;  
	  
	// printing the value of x using reference variable obj1   
	System.out.println("The value of x is: " + obj1.x);  
	} 
}
