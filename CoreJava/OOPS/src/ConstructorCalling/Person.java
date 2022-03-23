package ConstructorCalling;

public class Person {
	
	private String firstName = null;
	private String lastName = null;
	private String address = null;
	
	public Person() {
		System.out.println("default");
	}
	public Person(String fn, String ln)
	{
		firstName = fn;
		lastName=ln;
		System.out.println("two parameter");
		
	}
	public Person(String fn, String ln, String add)
	{
		/*
		 * firstName=fn; lastName=ln;
		 */
		this(fn,ln);
		address=add;
		System.out.println("three parameter");
	}
	

}
