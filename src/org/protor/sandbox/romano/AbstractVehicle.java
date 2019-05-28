package org.protor.sandbox.romano;

import java.io.File;

import org.w3c.dom.Node;

public abstract class AbstractVehicle {
	// Attributi della classe 
	private String name = "";
	private EnumEngineType engineType = EnumEngineType.NONE;
	private double range = 0.0; // km
	private double endurance = 0.0; // hours 
	private int numMaxPassengers= 0;
	private double maxPayload = 0.0; // kg
	
	protected File configFile;
	protected Node node;
	
	// ------------------------------ Constructors
	public AbstractVehicle(File configFile) {
		super ();
		this.configFile = configFile; // Quando lo vado ad usare questo file esiste
		this.loadFromFile(configFile); // Funzione per leggere quel file
	}
	protected abstract boolean loadFromFile (File configFile); // implement in subclasses 
	
	public AbstractVehicle(Node node) {
		this.node = node; 
		this.loadFromNode(this.node);  // implement in classes
	}
	protected abstract boolean loadFromNode (Node node); // implement in subclasses
	
	public AbstractVehicle(EnumEngineType type) {
		this.engineType = type;
	}

	public AbstractVehicle(String name, EnumEngineType type) {
		this.name = name;
		this.engineType = type;
	}
	/**
	 * 
	 * @param name Name of Vehicle
	 * @param engineType Type of Vehicle
	 * @param range Number of km
	 * @param endurance km with full fuel
	 * @param numMaxPassengers Numbers of Passengers
	 * @param maxPayload Maximum payload (kg)
	 */
	
	public AbstractVehicle(String name,
			EnumEngineType engineType, 
			double range, double endurance, 
			int numMaxPassengers, double maxPayload) {
		super();
		this.name = name;
		this.engineType = engineType;
		this.range = range;
		this.endurance = endurance;
		this.numMaxPassengers = numMaxPassengers;
		this.maxPayload = maxPayload;
	}
	
	// -------------------------------- Methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public EnumEngineType getEngineType() {
		return engineType;
	}
	public void setEngineType(EnumEngineType engineType) {
		this.engineType = engineType;
	}
	public double getRange() {
		return range;
	}
	public void setRange(double range) {
		this.range = range;
	}
	public double getEndurance() {
		return endurance;
	}
	public void setEndurance(double endurance) {
		this.endurance = endurance;
	}
	public int getNumMaxPassengers() {
		return numMaxPassengers;
	}
	public void setNumMaxPassengers(int numMaxPassengers) {
		this.numMaxPassengers = numMaxPassengers;
	}
	public double getMaxPayload() {
		return maxPayload;
	}
	public void setMaxPayload(double maxPayload) {
		this.maxPayload = maxPayload;
	}
    }

