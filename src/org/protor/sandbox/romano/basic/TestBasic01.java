package org.protor.sandbox.romano.basic;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class TestBasic01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new A();
		System.out.println(a1);
		
		a1.setI(1);
		a1.setD(-0.5);
		a1.setS("Oggetto A1");
		System.out.println(a1);
		
		A a2 = new A (2, 3, "Oggetto A2");
		System.out.println(a2);
		
		System.out.println("---------------------------");
		
		B b1 = new B();
		System.out.println(b1);
		
		b1.setSa(new String [] {"del", "si", "Pre"});
		System.out.println(b1);
		
		System.out.println("---------------------------");
		
		for ( int k =0; k< b1.getSa().length; k++)
			System.out.println(b1.getSa()[k]);
		
		String [] s1 = b1.getSa();
		
		System.out.println("---------------------------");
		s1 [0]= "AAAAA";
//		String [] s2 = new String [] {b1.getSa()[0], b1.getSa()[1], b1.getSa()[2]};
//		String [] s3 = new String [3];
//		for (int k = 0; k < 3 ; k++
//      s3[k] = b1.getSa()[k]
			
		
		for ( String s : b1.getSa())
		System.out.println(s);
		
		System.out.println("---------------------------");
		
		String [] s1a = Arrays.copyOf(b1.getSa(), b1.getSa().length+1);
		s1a [0]= "GGGGG";
		
		for ( String s : b1.getSa())
			System.out.println(s);
		
		s1a[3]= ">>>>>>>>>>>>>>>>>>>>>";
		System.out.println("---------------------------");
		//try {
		    for ( String s : s1a)
			System.out.println(s.toUpperCase());
		//} catch (Exception e) {
		//	e.printStackTrace();
	    //  }

		// System.out.println(b1);
		    
		    //concateniamo le 2 stringhe
		   String [] s1b = ArrayUtils.addAll(s1, s1a); // Uso Apache Commons Lang
		   System.out.println("----------");
			//try {
			    for ( String s : s1b) // è un contatore elegente 
		   System.out.println(s);
    }
	}
