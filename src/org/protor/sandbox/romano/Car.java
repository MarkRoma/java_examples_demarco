package org.protor.sandbox.romano;

import java.io.File;
import java.util.List;

import org.protor.filesio.utils.XMLUtils;
import org.protor.sandbox.agodemar.AbstractTerrestrialVehicle;
import org.protor.sandbox.agodemar.EnumEngineType;
import org.protor.sandbox.agodemar.EnumGroundContactType;
import org.w3c.dom.Node;

public class Car extends AbstractTerrestrialVehicle {

	public Car(EnumEngineType engineType) {
		super(engineType);
	}

	public Car(File configFile) {
		super(configFile);
	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload, EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload, groundContactType);

	}

	public Car(String name, EnumEngineType engineType, double range, double endurance, int numMaxPassengers,
			double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
	}

	public Car(String name, EnumEngineType engineType) {
		super(name, engineType);
	}	

	@Override
	protected boolean loadFromFile(File configFile) {

		// TODO agodemar: implement the logic here

		System.out.println("[Car]Reading data from file " +
				configFile.getAbsolutePath());



		System.out.println("[Car] Reading data from file: "
				+ configFile.getAbsolutePath());

		System.out.println("... function not implemented yet.");

		return false;
	}

	@Override
	protected void loadFromNode (Node node) {
		if (node.getNodeType() == Node.ELEMENT_NODE ) { //ELEMENT_NODE è una costante final

			this.name = XMLUtils.getXMLPropertyByPath(node, "// name/test()");

			List <String> passengersValuesList = XMLUtils.getXMLAttributesByPath(node,
					"//passengers", "value");

			if (passengersValuesList.size() > 0) {
				try {
					this.numMaxPassengers = Integer.parseInt(passengersValuesList.get(0));

				} catch (NumberFormatException e) {
					e.printStackTrace();
					System.err.print("[Car.loadFromNode]");
					System.out.println("Car \'" + this.name + "\' incorrect passenger number.");
					System.err.println("Keeping default value:" + this.numMaxPassengers);
					// do nothing, continue
				}
			}
			List <String> rangeValuesList = XMLUtils.getXMLAttributesByPath(node,
					"//range_km", "value");

			if (rangeValuesList.size() > 0) 
				try {
					this.range = Integer.parseInt(passengersValuesList.get(0));
				}
			 catch (NumberFormatException e) {
					e.printStackTrace();
					System.err.print("[Car.loadFromNode]");
					System.out.println("Car \'" + this.name + "\' incorrect passenger number.");
					System.err.println("Keeping default value:" + this.range);
					// do nothing, continue
			
			// .....
			 } else {
		System.err.print("[Car.loadFromNode]");
		System.out.println("Node is not an ELEMENT_NODE " );
		// do nothing, continue
	}
	}
			}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("--- Car Object ---\n");
		sb.append("Name: " + this.name + "\n");
		sb.append("Ground contact: " + this.groundContactType + "\n");
		sb.append("Engine type: " + this.engineType + "\n");
		sb.append("------------------------\n");
		return sb.toString();
	}
}
