package org.protor.sandbox.romano;

import java.util.ArrayList;
import java.util.List;

import org.protor.sandbox.agodemar.Car;
import org.protor.sandbox.agodemar.EnumEngineType;
import org.protor.sandbox.agodemar.EnumGroundContactType;

public class Test01 {

	public static void main(String[] args) {

//		AbstractVehicle v1 = new AbstractVehicle(VehicleType.TERRESTRIAL);
//		v1.setName("Fiat 600");
//
//		AbstractVehicle v2 = new AbstractVehicle("Eurofighter", VehicleType.AERIAL);
//
//		System.out.println("v1 - Name: " + v1.getName());
//		System.out.println("v1 - Type: " + v1.getType());
//
//		System.out.println("v2 - Name: " + v2.getName());
//		System.out.println("v2 - Type: " + v2.getType());

		Car car1 = new Car(
				"Tesla model 3", 
				EnumEngineType.ELECTRIC, 
				500.0, 4.5,  4, 500.0, EnumGroundContactType.WHEELS);

		Car car2 = new Car(EnumEngineType.THERMICAL);
		car2.setName("BMW X1");

//		System.out.println(car1.toString());
//		System.out.println(car2);

		System.out.println("--------------------------");

		List<Car> list = new ArrayList<Car>();
		
		list.add(car1);
		list.add(car2);
		list.add(
				new Car(
						"Nissan XTrail", 
						EnumEngineType.THERMICAL, 
						500.0, 4.5,  4, 500.0, EnumGroundContactType.WHEELS
						)
				);
		
		for(Car c : list) {
			System.out.println(c);
		}

	}

	}
