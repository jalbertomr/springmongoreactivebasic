package com.bext.spring.depInj.impl;

import com.bext.spring.depInj.Clean;

public class Car implements Clean{

	@Override
	public String getName() {
		return "Car Clean";
	}

}
