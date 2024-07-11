package com.andt.funny.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.andt.funny.app.factory.VehicleFactoryInstance;
import com.andt.funny.app.factory.VehicleFactorySpring;
import com.andt.funny.app.factory.VehicleFactoryStatic;
import com.andt.funny.app.factory.VehicleFactoryStatic.VehicleType;
import com.andt.funny.app.model.Vehicle;

@Configuration
public class AppConfig {

	@Bean
	Vehicle carStatic() {
		return VehicleFactoryStatic.createVehicle(VehicleType.FOURWHEEL);
	}

	@Bean
	Vehicle bikeStatic() {
		return VehicleFactoryStatic.createVehicle(VehicleType.TWOWHEEL);
	}

	@Bean
	VehicleFactoryInstance vehicleFactoryInstance() {
		return new VehicleFactoryInstance();
	}

	@Bean
	Vehicle carInstance(VehicleFactoryInstance vehicleFactoryInstance) {
		return vehicleFactoryInstance.createVehicle(VehicleFactoryInstance.VehicleType.FOURWHEEL);
	}

	@Bean
	Vehicle bikeInstance(VehicleFactoryInstance vehicleFactoryInstance) {
		return vehicleFactoryInstance.createVehicle(VehicleFactoryInstance.VehicleType.TWOWHEEL);
	}

	@Bean
	VehicleFactorySpring carSpring() {
		return new VehicleFactorySpring() {
			{
				setVehicle(carStatic());
			}
		};
	}

	@Bean
	VehicleFactorySpring bikeSpring() {
		return new VehicleFactorySpring() {
			{
				setVehicle(bikeInstance(vehicleFactoryInstance()));
			}
		};
	}

}
