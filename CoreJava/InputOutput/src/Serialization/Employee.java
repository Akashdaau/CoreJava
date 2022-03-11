package Serialization;
import java.io.Serializable; 


public class Employee implements Serializable { 
		 int id;  
		 String name;  
		 
		 public Employee() {
			 
		 }
		 public Employee(int id, String name) {  
		  this.id = id;  
		  this.name = name;  
		 }
		 
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}

		 
		}  
