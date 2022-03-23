package Compare;

public class Comp implements Comparable<Comp> {

	public Integer id;

	public Comp() {

	}

	public Comp(Integer id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode();
	}

	@Override
	public int compareTo(Comp o) {
		// TODO Auto-generated method stub
		return this.id.compareTo(o.id);
	}

	
	  @Override public boolean equals(Object obj) {
	  
	  Comp other = (Comp) obj; // typecasting through class name return
	  return this.id.equals(other.id); }
	 

}
