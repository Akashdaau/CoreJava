package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedR {
	public static void main(String[] args) throws Exception{
		FileReader r= new FileReader("D:/io.txt");
		BufferedReader b= new BufferedReader(r);
		
		String s=b.readLine();
		
		while(s!=null)
		{
			System.out.println(s);
		
			s=b.readLine();
		}
		r.close();
		
	}

}
