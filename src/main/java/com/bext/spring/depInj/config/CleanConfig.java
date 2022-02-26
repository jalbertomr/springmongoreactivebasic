package com.bext.spring.depInj.config;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.bext.spring.depInj.Clean;
import com.bext.spring.service.CleanService;

@Configuration
@PropertySource("classpath:/clean.properties")
public class CleanConfig {
	static final Logger LOG = LoggerFactory.getLogger(CleanConfig.class);
	
    @Autowired
    List<Clean> clean;
    
    @Bean
	public CleanService getCleanService() {
		return  new CleanService(clean);
	}
    
    @Bean
    public CleanService getCleanServicesFromProperties(@Value("${Clean.names}") List<String> listStringClean) {
    	listStringClean.stream().map(e -> "listStringClean: " + e ).forEach(LOG::info);   
    	
    	LOG.info("clean classes get first part of the getname {}", 
    			clean.stream().map(e->e.getName().split("\\s+")).map(e-> e[0]).collect(Collectors.toList()) );
    	// clean classes get first part of the getname [Car, House, Shoes]
    	
    	List<Clean> cleanServiceFiltered = clean.stream().filter(e -> listStringClean.contains(e.getName())).collect(Collectors.toList());
    	
    	LOG.info("cleanServiceFiltered.size(): {}", cleanServiceFiltered.size());
    	cleanServiceFiltered.stream().map(Clean::getName).map(e -> "cleanServiceFiltered: " + e).forEach(LOG::info);
    	
    	//return new CleanService( new ArrayList<Clean>());
    	return new CleanService( cleanServiceFiltered);
    }
}
