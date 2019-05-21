package org.protor.sandbox.romano;

import java.io.File;

public abstract class AbstractTerrestrialVehicle extends AbstractVehicle{
	
	private EnumGroundContactType groundContactType = EnumGroundContactType.WHEELS;
	
	public AbstractTerrestrialVehicle (EnumEngineType type) {
		super (type);
	}
	public AbstractTerrestrialVehicle (String name, EnumEngineType type) {
		super (name, type);
	}
	public AbstractTerrestrialVehicle(File configFile) {
		super(configFile);
		
	}
	public AbstractTerrestrialVehicle(String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		
	}
	
	public AbstractTerrestrialVehicle(
			String name, EnumEngineType engineType, double range, double endurance,
			int numMaxPassengers, double maxPayload,
			EnumGroundContactType groundContactType) {
		super(name, engineType, range, endurance, numMaxPassengers, maxPayload);
		this.groundContactType = groundContactType;
	}
	
	public EnumGroundContactType getGroundContactType() {
		return groundContactType;
	}
	public void setGroundContactType(EnumGroundContactType groundContactType) {
		this.groundContactType = groundContactType;
	}
}
