package Compare;

public class TestComp {
	public static void main(String[] args) throws Exception {

		Comp c1 = new Comp(3);
		Comp c2 = new Comp(3);
		// Comp c3=new Comp("akash");

		/*
		 * if (c1.hashCode() == c2.hashCode()) {
		 * 
		 * if (c1.equals(c2)) { System.out.println("haa equal h"); } else {
		 * System.out.println("nahi h"); } }
		 */
		
		

		//System.out.println(c2.hashCode());
		if(c1.id>c2.id)
		{
			System.out.println("pehli badi h, equal nhi h");
		}
		else
		{
			if (c1.id==c2.id)
			{
				System.out.println("barabar h");
			}
			else
			{
				System.out.println("dusri badi h, equal nhi h");
			}
		}

	}

}
