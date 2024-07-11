package com.andt.funny.app.factory;

import org.springframework.beans.factory.config.AbstractFactoryBean;

import com.andt.funny.app.model.Vehicle;

import lombok.Setter;

@Setter
public class VehicleFactorySpring extends AbstractFactoryBean<Vehicle> {

	private Vehicle vehicle;

	@Override
	public Class<?> getObjectType() {
		return vehicle.getClass();
	}

	@Override
	protected Vehicle createInstance() throws Exception {
		return vehicle;
	}

}
