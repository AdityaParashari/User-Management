package com.capg.flightmanagement.exception;

public class PassengerNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PassengerNotFoundException(String msg){
        super(msg);
}
}
