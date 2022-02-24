package com.bext.spring.depInj.impl;

import org.springframework.stereotype.Component;

import com.bext.spring.depInj.Drink;

@Component
public class Coffee implements Drink{

	@Override
	public String getName() {
		return "Coffee Drink";
	}
}
