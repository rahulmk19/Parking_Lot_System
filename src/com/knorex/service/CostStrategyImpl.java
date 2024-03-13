package com.knorex.service;

import com.knorex.Model.VehicleType;
import com.knorex.repository.CostStrategy;

public class CostStrategyImpl implements CostStrategy {

	@Override
	public double calculateParkingFee(VehicleType type, int durationInHours) {
		switch (type) {
		case BIKE:
			return durationInHours * 10;
		case CAR:
			return durationInHours * 20;
		case BUS:
		case TRUCK:
			return durationInHours * 30;
		default:
			return 0;
		}
	}

}
