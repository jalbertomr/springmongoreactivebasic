package com.bext.spring.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bext.spring.depInj.Clean;

public class CleanService {
   static final Logger LOG = LoggerFactory.getLogger(CleanService.class);
   
   private List<Clean> clean;
   
   public CleanService( List<Clean> clean) {
	   this.clean = clean;
	   LOG.info("Constructor CleanService clean.size(): {}", clean.size());
	   this.logCleanName();
   }
   
   public void logCleanName() {
	   //LOG.info("CleanService.logCleanName() {}", clean.getName());
	   clean.stream().map(Clean::getName).map(e -> "CleanService available: " + e).forEach(LOG::info);
   }
   
}
