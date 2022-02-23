package com.bext.spring.depInj.impl;

import com.bext.spring.depInj.Clean;

public class House implements Clean{

	@Override
	public String getName() {
		return "House Clean";
	}

}
