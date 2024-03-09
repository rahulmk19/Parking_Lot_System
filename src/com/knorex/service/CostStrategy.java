package com.knorex.service;

import com.knorex.Model.VehicleType;

public interface CostStrategy {

	double calculateParkingFee(VehicleType type, int durationInHours);
}
