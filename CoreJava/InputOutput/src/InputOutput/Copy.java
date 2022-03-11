package InputOutput;

import java.io.FileReader;
import java.io.FileWriter;

public class Copy{
	public static void main(String[] args) throws Exception{
	
    FileReader r = new FileReader("D:/io.txt");
	FileWriter w = new FileWriter("D:/copyio.txt",true);
	
	int ch= r.read();
	
	while(ch!=-1)
	{
		//char chr= (char)ch;
		w.write(ch);
		//System.out.println(chr);
		ch=r.read();
	}
	w.close();
	r.close();
	
	System.out.println("done");

}
}