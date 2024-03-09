package com.knorex.Model;

import java.util.ArrayList;
import java.util.List;

public class Floor {

	private int floorNumber;
	private List<VehicleSpace> vehicleSpaces;

	public Floor(int floorNumber, int totalSpaces, VehicleType type) {
		this.floorNumber = floorNumber;
		this.vehicleSpaces = initializeVehicleSpaces(totalSpaces, type);
	}

	private List<VehicleSpace> initializeVehicleSpaces(int totalSpaces, VehicleType type) {
		List<VehicleSpace> spaces = new ArrayList<>();
		for (int i = 1; i <= totalSpaces; i++) {
			spaces.add(new VehicleSpace(i, type));
		}
		return spaces;
	}

	public boolean hasAvailableSpace(VehicleType type) {
		return vehicleSpaces.stream().anyMatch(space -> space.isAvailable() && space.getType() == type);
	}

	public VehicleSpace parkVehicle(Vehicle vehicle) {
		for (VehicleSpace space : vehicleSpaces) {
			if (space.isAvailable() && space.getType() == vehicle.getType()) {
				space.occupy(vehicle);
				return space;
			}
		}
		return null;
	}

	public void removeVehicle(String registrationNumber) {
		for (VehicleSpace space : vehicleSpaces) {
			if (!space.isAvailable() && space.getVehicle().getRegistrationNumber().equals(registrationNumber)) {
				space.vacate();
				break;
			}
		}
	}
}
