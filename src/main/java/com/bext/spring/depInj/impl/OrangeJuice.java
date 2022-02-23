package com.bext.spring.depInj.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.bext.spring.depInj.Drink;

@Component
public class OrangeJuice implements Drink {

	@Override
	public String getName() {
		return "OrangeJuice Drink";
	}

}
