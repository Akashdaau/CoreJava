

package Compare;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.List;

public class TestEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee(2, "SHubham", "Sharma", 10000));
		list.add(new Employee(1, "Aakash", "Zuber", 30000));
		list.add(new Employee(3, "Aakash", "Joshi", 50000));


		
		
		//  String s1 = "SortByName";
	
		/*public int compare(Employee o1, Employee o2)
		{
		
		
		if(o1.name==o2.name) 
		  {*/
			 
		 /* else
		  { Collections.sort((List<T>), new SortBySalary()); }*/
		 
		
		System.out.println("sorting by salary  ");
		
		Collections.sort(list, new SortBySalary());
		
		System.out.println("sorting by name   ");
	
	
		 Collections.sort (list, new SortByName());
	}
	
		  
		 public static void printEmployees(ArrayList<Employee> list)
		 {
			 for(Employee o: list)
		  { 
			  System.out.println(o.salary + o.name); 
			  }

		 
		/*Iterator <Employee>it = list.iterator();
		
		
		
		
		
		while(it.hasNext()) {
			Employee o= it.next();
			System.out.println(it.next());
			*/
			
			
			/*System.out.println(o.getLastname());*/
	}
}
