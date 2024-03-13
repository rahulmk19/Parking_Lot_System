package com.knorex.main;

import com.knorex.Model.Vehicle;
import com.knorex.Model.VehicleType;
import com.knorex.repository.CostStrategy;
import com.knorex.repository.ParkingLotOperations;
import com.knorex.service.CostStrategyImpl;
import com.knorex.service.ParkingLotServiceImpl;

public class Main {

	public static void main(String[] args) {
		CostStrategy costStrategy = new CostStrategyImpl();

		ParkingLotOperations parkingLotService = new ParkingLotServiceImpl(costStrategy);
		parkingLotService.init(2, 5, VehicleType.CAR);

		parkingLotService.addVehicle(new Vehicle("Car123", "Red", VehicleType.CAR, 10));

		parkingLotService.addVehicle(new Vehicle("Car456", "Blue", VehicleType.CAR, 0));

		parkingLotService.checkAvailability(2, VehicleType.CAR);

		parkingLotService.removeVehicle("Car123");

		((ParkingLotServiceImpl) parkingLotService).calculateParkingFee(VehicleType.CAR, 4);
	}

}
