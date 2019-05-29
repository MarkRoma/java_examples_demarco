package org.protor.sandbox.romano.basic;

public class A {

	private int i;
	private double d;
	private String s;
	
	public A (int i, int d, String s) {
	super ();
	this.i = i;
	this.d = d ;
	this.s = s ;
}

	public A() {
		// TODO Auto-generated constructor stub
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		this.i = 0;
		this.d = 0;
		this.s = "Preside!";
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", d=" + d + ", s=" + s + "]";
	}
}

