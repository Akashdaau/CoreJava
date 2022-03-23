package ConstructorCalling;

public class Employee extends Person{
	private String role=null;
	
	public Employee()
	{
		System.out.println("Default C");
	}
	
	public Employee(String fn, String ln, String role)
	{
		super(fn,ln);
		role=role;
		System.out.println("three para");
	}

}
