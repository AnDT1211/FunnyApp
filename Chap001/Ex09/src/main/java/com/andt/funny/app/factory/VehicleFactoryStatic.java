package com.andt.funny.app.factory;

import com.andt.funny.app.model.Bike;
import com.andt.funny.app.model.Car;
import com.andt.funny.app.model.Vehicle;

public class VehicleFactoryStatic {

	public static Vehicle createVehicle(VehicleType type) {
		return switch (type) {
			case FOURWHEEL -> new Car();
			default -> new Bike();
		};
	}

	public enum VehicleType {
		FOURWHEEL, TWOWHEEL
	}
}
