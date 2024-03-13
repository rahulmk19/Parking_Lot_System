# Car Parking System

This project is a Java implementation of a car parking system that can accommodate different types of vehicles and supports a configurable cost strategy.

## Features

1. **Initialization:** Initialize the parking lot with a given number of floors and car spaces per floor for each vehicle type.
2. **Add Vehicle:** Add vehicle details to the parking lot, including the vehicle type, registration number, and color.
3. **Remove Vehicle:** Remove a vehicle from the parking lot based on the registration number.
4. **Check Availability:** Check the availability of vehicle spaces on a specific floor for a given vehicle type.

## Classes

1. **ParkingLot:** Represents the parking lot and manages vehicle spaces.
2. **Vehicle:** Represents a vehicle with attributes such as vehicle type, registration number, and color.
3. **Floor:** Represents a floor in the parking lot with attributes like floor number and vehicle spaces.
4. **ParkingSpace:** Represents a vehicle space with attributes such as space number, availability, and vehicle type.
5. **CostStrategy:** Represents the cost strategy for parking, allowing for varying costs based on the vehicle type.

## Usage

To use the car parking system, follow these steps:

1. **Initialization:** Initialize the parking lot by providing the total number of floors and vehicle spaces per floor for each vehicle type.
2. **Add Vehicle:** Add vehicles to the parking lot using the `addVehicle` method.
3. **Remove Vehicle:** Remove vehicles from the parking lot using the `removeVehicle` method.
4. **Check Availability:** Check the availability of vehicle spaces on a specific floor for a given vehicle type using the `checkAvailability` method.

## Message
Special thanks to you for visiting my project, feel free to personalize the message according to your preferences!
