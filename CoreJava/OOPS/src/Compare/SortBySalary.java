package Compare;

import java.util.Collections;
import java.util.Comparator;

public class SortBySalary implements Comparator<Employee>{
	
	public int compare(Employee o1, Employee o2)
	{
		int value =0;
		if (o1.salary>o2.salary)
		{
			value=1;
		}
		else if (o1.salary<o2.salary)
		{
			value=-1;
		}
		else if (o1.salary==o2.salary)
		{
			value=0;
		}
		return value;
	}
	
	 
	

}
