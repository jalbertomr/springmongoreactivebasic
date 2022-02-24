package com.bext.spring.depInj.impl;

import org.springframework.stereotype.Component;

import com.bext.spring.depInj.Clean;

@Component
public class Car implements Clean{

	@Override
	public String getName() {
		return "Car Clean";
	}

}
