package com.bext.spring.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bext.spring.depInj.Clean;

public class CleanService {
   static final Logger LOG = LoggerFactory.getLogger(CleanService.class);
   
   private Clean clean;
   
   public CleanService( Clean clean) {
	   this.clean = clean;
	   LOG.info("Constructor CleanService {}", clean.getName());
   }
   
   public void logCleanName() {
	   LOG.info("CleanService.logCleanName() {}", clean.getName());
   }
   
}
