package org.protor.sandbox.romano.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class C extends AbstractB {
	
	double f ;
	List<Double> l;
    
    public C () {
    	super ();
    	System.out.println("C>> constructor with no fields");
    	initialize ();
    }
    
    public C (int i, boolean b, double d, int [] ia, double f, List<Double> l) {
    	super (i,b,d,ia);
    	this.f = f;
    	this.l = l;
    	System.out.println("C >> constructor with fields (i,b,d,ia,f,l)");
    }
  
    private void initialize () {
    	System.out.println("C>>initialize ");
    	this.f = -3.1415;
    	this.l = new ArrayList<>();	
    }

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString()+ "\n");
		
		sb
		.append("C [ f=" + this.f + " , ")
		.append("l=" + Arrays.toString(this.l.toArray()))
		.append("]");
		return sb.toString();
	}
	
    /**
     * get all numbers contained in an object of class C and collect them into
     * a list of Double. Multiply integers by a and double by b
     * @param a
     * @param b
     * @return list of Numbers
     */
	public  List<Double> getAllNumbers(double a, double b) {
		
		List<Double> allNumbers = new ArrayList<Double>(); 
		
		allNumbers.add((double) (this.i * a));
		allNumbers.add(this.d * b);
		allNumbers.add(this.f * b);
		
		for (int k : this.ia) {
			allNumbers.add((double) (k * a));
		}
		
		// TODO :  make the ath operation via Stream/map
		allNumbers.addAll(this.l);
		
		return allNumbers ;
		
		}
		
	}
    

