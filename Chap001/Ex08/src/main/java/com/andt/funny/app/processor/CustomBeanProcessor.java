package com.andt.funny.app.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.andt.funny.app.model.Car;

@Component
public class CustomBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean name: " + beanName + " is init");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof Car car) {
			if (car.getName().equals("unknown")) {
				throw new BeanCreationException(beanName + " cannot have a name: " + car.getName());
			}
		}
		return bean;
	}
}
