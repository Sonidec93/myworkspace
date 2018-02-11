package com.practice.Log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LoggingExample {
	
	final static Logger LOGGER=Logger.getLogger(LoggingExample.class);

	
	public static void main(String[] args) {
		
		DOMConfigurator.configure("log4j.xml");
	LOGGER.info("this is info");
	LOGGER.error("this is an error");
	
	}
	
}
