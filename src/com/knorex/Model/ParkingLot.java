package com.knorex.Model;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	private List<Floor> floors;

	public ParkingLot(int totalFloors, int spacesPerFloor, VehicleType type) {
		this.floors = initializeFloors(totalFloors, spacesPerFloor, type);
	}

	private List<Floor> initializeFloors(int totalFloors, int spacesPerFloor, VehicleType type) {
		List<Floor> init = new ArrayList<>();
		for (int floorNumber = 1; floorNumber <= totalFloors; floorNumber++) {
			init.add(new Floor(floorNumber, spacesPerFloor, type));
		}
		return init;
	}

	public boolean checkAvailability(int floorNumber, VehicleType type) {
		if (floorNumber >= 1 && floorNumber <= floors.size()) {
			Floor floor = floors.get(floorNumber - 1);
			return floor.hasAvailableSpace(type);
		}
		return false;
	}

	public void addVehicle(Vehicle vehicle) {
		for (Floor floor : floors) {
			if (floor.hasAvailableSpace(vehicle.getType())) {
				floor.parkVehicle(vehicle);
				return;
			}
		}
		System.out.println("Parking is full for type " + vehicle.getType());
	}

	public void removeVehicle(String registrationNumber) {
		for (Floor floor : floors) {
			floor.removeVehicle(registrationNumber);
		}
	}
}
