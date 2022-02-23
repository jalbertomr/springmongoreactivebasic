package com.bext.spring.depInj.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bext.spring.depInj.Drink;

@Component
@Qualifier("OrangeJuice")
public class OrangeJuice implements Drink {

	@Override
	public String getName() {
		return "OrangeJuice Drink";
	}

}
