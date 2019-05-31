package org.protor.sandbox.agodemar.basic;

import java.util.List;

public interface Interface2 {
	
	public List<Double> calculate2a(List<C> l2, double a);
	

	/**
	 * Returns the list of eigenvalues for frequency range [a, b]
	 * @param listOfNodes list of mesh nodes
	 * @param a lower limit of frequency range
	 * @param b upper limit of frequency range
	 * @return list of eigenvalues
	 */
	public List<Double> calculate1a(List<C> listOfNodes, double a, double b);
	
	public double[] calculate2b(List<C> l);

}
