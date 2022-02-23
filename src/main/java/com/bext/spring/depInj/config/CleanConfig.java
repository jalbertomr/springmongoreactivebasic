package com.bext.spring.depInj.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bext.spring.depInj.Clean;

public class CleanConfig {
    public static Logger LOG = LoggerFactory.getLogger(CleanConfig.class);
	
	public Clean getCarClean() {
		return new Clean() {
			@Override
			public String getName() {
				LOG.info("CleanConfig.getCarClean()" );
				return "CleanConfig Car Clean";
			}
		};
	}
}
