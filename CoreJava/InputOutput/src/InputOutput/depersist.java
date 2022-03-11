package InputOutput;
import java.io.*; 
 
public class depersist{  
 public static void main(String args[]){  
  try{  
	  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  
  Serial s=(Serial)in.readObject();  
  
  System.out.println(s.id+" "+s.name);  
    
  in.close();  
  }catch(Exception e){
	  System.out.println(e);}  
 }  
}  
