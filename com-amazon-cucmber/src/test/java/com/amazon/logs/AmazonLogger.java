package com.amazon.logs;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AmazonLogger {
	
	Logger log = Logger.getLogger(AmazonLogger.class.getName());
	
	public void fine(String message) {
		log.fine(message);
	}
	public void warning(String message) {
		log.warning(message);
	}
	public void info(String message) {
		log.info(message);
		
	}
	public void error(String message) {
		log.severe(message);
		
	}
	
	public void severe(String message) {
		log.log(Level.SEVERE, message);
	}
	

}
