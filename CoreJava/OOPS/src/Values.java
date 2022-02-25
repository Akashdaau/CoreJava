
public class Values {
	public static void main(String[] args) {
		Result t=new Result();
		t.setName("Akash");
		
		Result z=new Result();
		z.setName("Abhishek");
		
		Result t1=new Result();
		t1.setMarks(20);
		
		String s=t.getName();
		System.out.println(s);
		
		int u=t1.getMarks();
		System.out.println(u);
		
		String ww=z.getName();
		System.out.println(ww);
		
	}

}
