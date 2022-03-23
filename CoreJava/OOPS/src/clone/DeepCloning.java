package clone;

public class DeepCloning implements Cloneable {
   
  public String name = null;
  public ShallowCloning account = null;

  public DeepCloning(String name) {
    this.name = name;
    account = new ShallowCloning(10);

  }

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * DeepCloning d = (DeepCloning) super.clone(); d.account = (ShallowCloning)
	 * account.clone(); return d; }
	 */

  public static void main(String[] args) throws CloneNotSupportedException {
    DeepCloning d1 = new DeepCloning("Ram");
    DeepCloning d2 = (DeepCloning) d1.clone();
    
    d2.account.balance = 20;
    System.out.println("balance : " + d2.account.balance); 

    /*//d1.name = "Ram";
    
     d2.account.acctype = "saving"; 
    //System.out.println("original data");
    System.out.println("balance :" + d1.account.balance);
    System.out.println("name : " + d1.name);
    //System.out.println("clone data");
    
    System.out.println("name : " + d2.name);
    */
    System.out.println(d1.name);
    System.out.println(d2.name);
  }

}