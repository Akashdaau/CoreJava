package FailFast;

import java.util.concurrent.CopyOnWriteArrayList;  
import java.util.Iterator;  
import java.util.ArrayList;
import java.util.ConcurrentModificationException;  
  
  
   
public class Students {  
      
      
    public static void main(String[] args)
    {  
          
        ArrayList<String> students = new ArrayList<String>();   
        students.add("Akash");   
        students.add("Akshay");   
        students.add("Abhishek");  
        students.add("Azhar");  
          
          
        //creating an instance of the Iterator class  
        Iterator itr = students.iterator();   
          
        //iterating ArrayList using Iterator   
        while (itr.hasNext()) {  
            if ((String)itr.next() == "Akshay")  
            	System.out.println(students);
                // It will not throw an exception   
                students.remove("Azhar");  
        }  
          
        System.out.println(students);  
         
    }   
}  
