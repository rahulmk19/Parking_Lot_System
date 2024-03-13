package com.knorex.repository;

import com.knorex.Model.VehicleType;

public interface CostStrategy {

	double calculateParkingFee(VehicleType type, int durationInHours);
}
