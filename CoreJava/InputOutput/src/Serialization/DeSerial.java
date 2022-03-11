package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerial {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream f = new FileInputStream("D:/ob.ser");
	ObjectInputStream in= new ObjectInputStream(f);
	
	Employee emp = (Employee)in.readObject();
	
	System.out.println(emp.getId());
	System.out.println(emp.getName());
	}
}
	
