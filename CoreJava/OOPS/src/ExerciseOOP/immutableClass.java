package ExerciseOOP;

	final class immutableClass {
	  private String name;
	  private int num;

	  immutableClass(String name, int num) {
	    /*super();*/
	    this.name = name;
	    this.num = num;

	  }

	
	
	  public String getName() { return name; }
	  
	  
	  
	  public int getNum() { return num; }
	 
	 
	  public static void main(String[] args) {
	    immutableClass i = new immutableClass("Akash", 18);
		 System.out.println("Name : " +i.getName() + " num : " +i.getNum()); 
		/* System.out.println(i); */
	  }

	  

}
