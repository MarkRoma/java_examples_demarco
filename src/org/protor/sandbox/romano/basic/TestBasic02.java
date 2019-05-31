package org.protor.sandbox.romano.basic;

import java.util.ArrayList;
import java.util.List;

public class TestBasic02 {

	public static void main(String[] args) {

		C c1 = new C();

		System.out.println(c1);
		System.out.println("---------------------");

		List<Double> l0 = new ArrayList <>();
		l0.add(-55.0);
		l0.add(-45.0);

		C c2 = new C(
				-10, true, -0.7,  // <---AbstracA
				new int [] {-1, 1, 1},  // <---AbstracB
				0.9, l0 );       //  <---C

		System.out.println(c2);
		
		System.out.println("------------------");

		List<C> nodes = new ArrayList<>();
		nodes.add(c1);
		nodes.add(c2);

		ToyC tc = new ToyC();
		List<Double> numbers = tc.calculate1a(nodes, -20.0, 89.5);

		tc.setInnerList(numbers);
		
		System.out.println(tc);
	}

}
