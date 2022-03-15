package Lambda;

public class Test implements Drawable {
		    public static void main(String[] args) {  
		       // int width=10;  
		          
		        //with lambda  
		        Drawable d2=()->{  
		            System.out.println(89);  
		        };  
		        d2.draw();  
		    }

			@Override
			public void draw() {
				// TODO Auto-generated method stub
				
			}

			  
		}  

