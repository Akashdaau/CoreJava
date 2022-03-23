package Compare;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	
	int id;
	String name;
	String lastname;
	int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id,String name, String lastname, int salary) {
		this.id=id;
		this.name=name;
		this.lastname=lastname;
		this.salary=salary;
	}
	
	

	public String getName() {
		return name;
	}

	

	public int getSalary() {
		return salary;
	}
	
	public String getLastname()
	{
		return lastname;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", lastname=" + lastname + ", salary=" + salary + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*
	 * @Override public int compare(Employee o1, Employee o2) { // TODO
	 * Auto-generated method stub return 0; }
	 */
	

	

	/*
	 * @Override public int compare(Employee o1, Employee o2) { // TODO
	 * Auto-generated method stub return 0; } public int compareTo(Employee o,
	 * Employee m) { if }
	 */
}
