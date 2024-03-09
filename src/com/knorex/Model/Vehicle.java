package com.knorex.Model;

public class Vehicle {

	private String registrationNumber;
	private String color;
	private VehicleType type;
	private int timestamp;

	public Vehicle(String registrationNumber, String color, VehicleType type, int timestamp) {
		this.registrationNumber = registrationNumber;
		this.color = color;
		this.type = type;
		this.timestamp = timestamp;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public VehicleType getType() {
		return type;
	}

	public void setType(VehicleType type) {
		this.type = type;
	}

	public int getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(int timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
