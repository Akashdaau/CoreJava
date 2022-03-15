package Lambda;

public class TestF implements FunctionalInterface
		{
		    public static void main(String args[])
		    {
		        FunctionalInterface obj = (int x)->{System.out.println(2*x);
		  
		      
		    };
		        //fobj.normalM();
		    obj.abstractM(5);
		        
		    }

			@Override
			public void abstractM(int x) {
				// TODO Auto-generated method stub
				
			}

			
		   
		}
