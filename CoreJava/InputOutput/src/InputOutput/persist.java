package InputOutput;
import java.io.*; 

   
public class persist{    
 public static void main(String args[]){    
  try{    
  //Creating the object    
  Employee s1 =new Employee(211,"ravi");  
  
    
  FileOutputStream fout=new FileOutputStream("f.txt");    
  ObjectOutputStream out=new ObjectOutputStream(fout);   
  
  out.writeObject(s1);  
  
  out.flush();       
  out.close();    
  System.out.println("success"); 
  }
  catch(Exception e){System.out.println(e);}    
 }    
}    
