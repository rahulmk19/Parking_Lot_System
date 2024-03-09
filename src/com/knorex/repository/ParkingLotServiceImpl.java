package com.knorex.repository;

import com.knorex.Model.ParkingLot;
import com.knorex.Model.Vehicle;
import com.knorex.Model.VehicleType;
import com.knorex.service.CostStrategy;

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
			parkingLot.addVehicle(vehicle);
		} else {
			System.out.println("Parking lot not initialized.");
		}

	}

	@Override
	public void removeVehicle(String registrationNumber) {
		if (parkingLot != null) {
			parkingLot.removeVehicle(registrationNumber);
		} else {
			System.out.println("Parking lot not initialized.");
		}

	}

	@Override
	public boolean checkAvailability(int floorNumber, VehicleType type) {
		if (parkingLot != null) {
			return parkingLot.checkAvailability(floorNumber, type);
		} else {
			System.out.println("Parking lot not initialized.");
			return false;
		}
	}

	public double calculateParkingFee(VehicleType type, int durationInHours) {
		return costStrategy.calculateParkingFee(type, durationInHours);
	}

}
