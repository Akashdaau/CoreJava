package InputOutput;

import java.io.FileWriter;
import java.io.PrintWriter;

public class Writing {
	public static void main(String[] args) throws Exception{
		FileWriter f= new FileWriter("D:/io.txt");
		PrintWriter p= new PrintWriter(f);
		
		p.print("akk");
		
		f.close();
		p.close();
		
		System.out.println("done");
		
		
		
		
		
	}

}
