package com.knorex.repository;

import com.knorex.Model.Vehicle;
import com.knorex.Model.VehicleType;

public interface ParkingLotOperations {

	void init(int totalFloors, int spacesPerFloor, VehicleType type);

	void addVehicle(Vehicle vehicle);

	void removeVehicle(String registrationNumber);

	boolean checkAvailability(int floorNumber, VehicleType type);
}
