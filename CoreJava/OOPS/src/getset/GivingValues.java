package getset;

public class GivingValues {
	public static void main(String[] args) {
	Person p=new Person();
	p.setNamee("Akash");
	p.setAddress("Indore");
	
	System.out.println(p.getNamee()+" "+p.getAddress());
	System.out.println(p.getAddress());
	
	Automobile a=new Automobile();
	a.setType("Bike");
	
	System.out.println(a.getType());
	}
	
	
	

}
