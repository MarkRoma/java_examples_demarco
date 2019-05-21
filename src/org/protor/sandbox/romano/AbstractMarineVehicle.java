package org.protor.sandbox.romano;

import java.io.File;

public abstract class AbstractMarineVehicle extends AbstractVehicle{
	public AbstractMarineVehicle (EnumEngineType type) {
		super (type);
	}
	public AbstractMarineVehicle (String name, EnumEngineType type) {
		super (name, type);
	}
	public AbstractMarineVehicle(File configFile) {
		super(configFile);
		
	}
	public AbstractMarineVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
	}


}
