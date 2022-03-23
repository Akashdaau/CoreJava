package Hashcd;

import java.util.HashMap;

public class TestCl {
	
	public static void main(String[] args) {
		Marksheet m1=new Marksheet();
		Marksheet m2= new Marksheet();
		//Marksheet m3=new Marksheet();
		
		m1.setName("bs");
		//m1.setName("bs");
		//m1.setRoll(1);
		
		m2.setName("bs");
		//m2.setRoll(1);
		
		//m3.setName("bs");
		
		System.out.println(m1.equals(m2));
		
		System.out.println(m1.hashCode()==m2.hashCode());
		
		//System.out.println(m1.getName());
		//System.out.println(m1.hashCode());
		
		/*
		 * HashMap map=new HashMap(); map.put(m1, m2);
		 */
	}

}
