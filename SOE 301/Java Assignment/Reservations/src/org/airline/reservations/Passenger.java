package org.airline.reservations;

public class Passenger {
	// Fields
	private String name;
	
	// Constructors
	public Passenger() {
		name = "Unknown name";
	}
	
	public Passenger(String name) {
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String toString() {
		return "Passenger" + this.getName();
	}
}
