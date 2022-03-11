package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
	public static void main(String[] args) throws IOException {
	
	FileOutputStream file= new FileOutputStream("D:/ob.ser");
	ObjectOutputStream out = new ObjectOutputStream(file);
	
	Employee emp = new Employee(21, "akash");
	
	out.writeObject(emp);
	out.flush();
	out.close();
	
	System.out.println("done");
	}
	

	

}
