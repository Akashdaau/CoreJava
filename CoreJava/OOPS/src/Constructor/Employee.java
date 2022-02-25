package Constructor;

public class Employee {
	public String name;
	public String name1;
	public double salary;
	public double salary1;
	
	

	public Employee(String n, double s) {
		name=n;
		salary=s;
	}
	public Employee(String n, String s, double t) {
		name=n;
		name1=s;
		salary=t;
	}
	public String fullname()
	{
		return name+name1;
		
	}
	public double getsalary()
	{
		return salary;
	}
	public String getname()
	{
		return name;
	}
}
