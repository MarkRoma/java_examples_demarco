package org.protor.sandbox.romano.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ToyC implements Interface1, Interface2 {
	
	private List<Double> innerList; //innerList è una lista di numeri
	
	public ToyC() {
		super();
		this.innerList = new ArrayList <>();
	}
	
	public ToyC(List<Double> l) {
		this.innerList = l;
	}
	
	public List<Double> getInnerList() {
		return innerList;
	}
	
	public void setInnerList(List<Double> l) {
		this.innerList = l;
	}

	@Override
	public List<Double> calculate1a(List<C> l1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Double> calculate1b(AbstractB bb) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double[] calculate2b(List<C> l2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Double> calculate2a(List<C> l2, double a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Double> calculate1a(List<C> listOfNode, double a, double b) {
		
	List<Double> result = new ArrayList <>();
	
	   for (C node : listOfNode) {
		   result.addAll(node.getAllNumbers(a, b));
	   }
	
		return result;
	}
    
	
}
