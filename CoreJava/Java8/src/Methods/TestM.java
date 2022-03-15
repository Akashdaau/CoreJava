package Methods;

public class TestM implements MethodsIn{   
	    public void second(){        
	        System.out.println("akash");    
	    }    
	    
	    public static void main(String[] args) {    
	        TestM dm = new TestM();    
	                               
	        dm.second();  
	        MethodsIn.third();
	        dm.first();
	   
	          
	    }    
	}    

