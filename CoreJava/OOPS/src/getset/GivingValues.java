package getset;

public class GivingValues {
	public static void main(String[] args) {
	Person p=new Person();
	
	p.setAddress("Indore");
	p.setNamee("Abhishek");
	System.out.println(p.getNamee());
	p.setNamee("Akash");
	//String s=p.getNamee();
	
	System.out.println(p.getNamee());
	
	
	/*System.out.println(p.getNamee()+" "+p.getAddress());
	System.out.println(p.getAddress());
	System.out.println(s);*/
	
	Automobile a=new Automobile();
	a.setType("Bike");
	
	System.out.println(a.getType());
	}
	
	
	

}
