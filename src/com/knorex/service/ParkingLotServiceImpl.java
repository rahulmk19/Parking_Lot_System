package com.knorex.service;

import com.knorex.Model.ParkingLot;
import com.knorex.Model.Vehicle;
import com.knorex.Model.VehicleType;
import com.knorex.repository.CostStrategy;
import com.knorex.repository.ParkingLotOperations;

public class ParkingLotServiceImpl implements ParkingLotOperations {

	private ParkingLot parkingLot;
	private CostStrategy costStrategy;

	public ParkingLotServiceImpl(CostStrategy costStrategy) {
		this.costStrategy = costStrategy;
	}

	@Override
	public void init(int totalFloors, int spacesPerFloor, VehicleType type) {
		parkingLot = new ParkingLot(totalFloors, spacesPerFloor, type);

	}

	@Override
	public void addVehicle(Vehicle vehicle) {
		if (parkingLot != null) {
			System.out.println(vehicle.getType() + " Parking slot for " + vehicle.getRegistrationNumber());
			parkingLot.addVehicle(vehicle);
		} else {
			System.out.println("Parking lot not initialized.");
		}

	}

	@Override
	public void removeVehicle(String registrationNumber) {
		if (parkingLot != null) {
			parkingLot.removeVehicle(registrationNumber);
			System.out.println("Vechile has been removed to this registrationNumber: " + registrationNumber);
		} else {
			System.out.println("Parking lot not initialized.");
		}

	}

	@Override
	public boolean checkAvailability(int floorNumber, VehicleType type) {
		if (parkingLot != null) {
			System.out.println("Availability on Floor " + floorNumber + " for Car: available");
			return parkingLot.checkAvailability(floorNumber, type);
		} else {
			System.out.println("Parking lot not initialized.");
			return false;
		}
	}

	public void calculateParkingFee(VehicleType type, int durationInHours) {
		double parkingFee = costStrategy.calculateParkingFee(type, durationInHours);
		System.out.println(type + " Parking fee for " + durationInHours + " hours: ₹" + parkingFee);
	}

}
