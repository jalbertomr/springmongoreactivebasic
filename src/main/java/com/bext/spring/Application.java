package com.bext.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bext.spring.depInj.config.CleanConfig;
import com.bext.spring.service.CleanService;
import com.bext.spring.service.EatService;

@SpringBootApplication
public class Application {
	public static Logger LOG = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(Application.class);
		springApplication.setWebApplicationType(WebApplicationType.REACTIVE);
		SpringApplication.run(Application.class, args);
	}

	@Autowired
    public void setDrinkService(EatService eatService) {
		eatService.logDrinkName();
	}
	
	public void callCleanConfig() {
		CleanConfig cleanConfig = new CleanConfig();
		CleanService cleanService = cleanConfig.getCleanService();
		cleanService.logCleanName();		
	}

}
