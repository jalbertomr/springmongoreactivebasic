package com.bext.spring.depInj.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.bext.spring.depInj.Clean;

@Component
@Primary
public class Car implements Clean{

	@Override
	public String getName() {
		return "Car Clean";
	}

}
