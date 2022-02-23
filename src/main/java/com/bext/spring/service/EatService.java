package com.bext.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.bext.spring.depInj.Drink;

@Service
public class EatService {
    static final Logger LOG = LoggerFactory.getLogger(EatService.class);
    
    private Drink drink;

	public EatService(@Qualifier("OrangeJuice") Drink drink) {
		this.drink = drink;
		LOG.info("Constructor EatService({})", drink.getName());
	}

	public void logDrinkName() {
		LOG.info("EatService.logDringName {}", drink.getName());
	}
    
}
