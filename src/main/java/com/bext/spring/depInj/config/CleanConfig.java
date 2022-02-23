package com.bext.spring.depInj.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bext.spring.depInj.Clean;
import com.bext.spring.service.CleanService;

@Configuration
public class CleanConfig {
    public static Logger LOG = LoggerFactory.getLogger(CleanConfig.class);
	
    @Autowired
    Clean clean;
    
    @Bean
	public CleanService getCleanService() {
		return  new CleanService(clean);
	}
}
