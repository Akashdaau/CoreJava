package Compare;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

	
	/*
	 * public int compare(Employee o1, Employee o2) { return
	 * o1.getName().compareTo(o2.getName());
	 * 
	 * }
	 */
	  
	/*
	 * public int compare(Employee o1, Employee o2) { return
	 * o1.getLastname().compareTo(o2.getLastname());
	 * 
	 * }
	 */
	 
	  


	//@Override
	/*public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/
		
		public int compare(Employee o1, Employee o2) {
			if(o1.name==o2.name)
			{
				return o1.lastname.compareTo(o2.lastname);
			}
			else
			{
				return o1.name.compareTo(o2.name);
			}
			
		}
		
	 
	




}
