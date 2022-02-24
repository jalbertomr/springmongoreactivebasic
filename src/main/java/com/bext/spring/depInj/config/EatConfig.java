package com.bext.spring.depInj.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bext.spring.depInj.Drink;
import com.bext.spring.depInj.impl.Coffee;
import com.bext.spring.depInj.impl.OrangeJuice;
import com.bext.spring.service.EatService;

@Configuration
public class EatConfig {
	@Autowired
    Drink drink;
	
	@Bean
	public EatService getEatService() {
		return new EatService( drink);
	}
	
	@Bean EatService getEatServiceFromProperties(@Value("${Drink.name}") String eatServiceFromProperties) {
		Drink drinkFromProperties = (eatServiceFromProperties.equals("Coffee") == true) ? new Coffee() : new OrangeJuice() ;
		return new EatService( drinkFromProperties);
	}
}
