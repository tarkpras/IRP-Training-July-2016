package org.cap.exception;

public class InvalidQuantityException extends Exception {

	public InvalidQuantityException(){
		
	}

	@Override
	public String getMessage() {
		
		return "Quantity must be greater than zero!";
	}
	
	
}
