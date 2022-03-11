package InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream i = new FileInputStream("D:/binary.jpg");
		FileOutputStream o = new FileOutputStream("D:/hjknm.jpg");
		int ch=i.read();
		while (ch!=-1)
		{
			//char chr =(char)ch;
			o.write(ch);
			
			//System.out.println(chr);
			ch=i.read();
		}
	    o.close();
	    i.close();
		
	}

}
