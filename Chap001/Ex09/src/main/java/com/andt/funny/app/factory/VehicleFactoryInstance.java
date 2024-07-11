package com.andt.funny.app.factory;

import com.andt.funny.app.model.Bike;
import com.andt.funny.app.model.Car;
import com.andt.funny.app.model.Vehicle;

import lombok.Setter;

public class VehicleFactoryInstance {
	
	public Vehicle createVehicle(VehicleType type) {
		return switch (type) {
			case FOURWHEEL -> new Car();
			default -> new Bike();
		};
	}

	public enum VehicleType {
		FOURWHEEL, TWOWHEEL
	}
}
