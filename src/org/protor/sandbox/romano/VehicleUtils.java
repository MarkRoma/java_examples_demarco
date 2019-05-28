package org.protor.sandbox.romano;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.protor.sandbox.agodemar.Car;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VehicleUtils {
	
	public static List<Car> loadListOfCars(File xmlFile) {
		
		List <Car> cars = new ArrayList<>();
		if (!xmlFile.exists()) {
			System.err.println("[VehicleUtils.loadListOfCars]");
			System.err.println("File" + xmlFile.getAbsolutePath() + "not found");
			return cars;
		}
		
		System.out.println("[VehicleUtils.loadListOfCars]");
		System.out.println("File" + xmlFile.getAbsolutePath());
		System.out.println("--- Now reading XML content ---");
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		
		return cars;
	}
	}