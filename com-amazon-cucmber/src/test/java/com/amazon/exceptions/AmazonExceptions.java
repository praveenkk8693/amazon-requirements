package com.amazon.exceptions;

public class AmazonExceptions extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AmazonExceptions(){
		super();
	}
	public AmazonExceptions(String message) {
		super(message);
		
	}
	public AmazonExceptions(String message,Throwable error) {
		super(message,error);
	}
	public AmazonExceptions(Throwable error) {
		super(error);
	}
	
	

}
