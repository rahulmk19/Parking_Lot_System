package com.knorex.main;

import com.knorex.Model.Vehicle;
import com.knorex.Model.VehicleType;
import com.knorex.repository.ParkingLotOperations;
import com.knorex.repository.ParkingLotServiceImpl;
import com.knorex.service.CostStrategy;
import com.knorex.service.CostStrategyImpl;

public class Main {

	public static void main(String[] args) {
		CostStrategy costStrategy = new CostStrategyImpl();

		ParkingLotOperations parkingLotService = new ParkingLotServiceImpl(costStrategy);
		parkingLotService.init(2, 5, VehicleType.CAR);

		parkingLotService.addVehicle(new Vehicle("Car123", "Red", VehicleType.CAR, 0));
		parkingLotService.addVehicle(new Vehicle("Car456", "Blue", VehicleType.CAR, 0));

		boolean available = parkingLotService.checkAvailability(1, VehicleType.CAR);
		System.out.println("Availability on Floor 1 for Car: " + available);

		parkingLotService.removeVehicle("Car123");

		double parkingFee = ((ParkingLotServiceImpl) parkingLotService).calculateParkingFee(VehicleType.CAR, 2);
		System.out.println("Parking fee for 2 hours: ₹" + parkingFee);
	}

}
