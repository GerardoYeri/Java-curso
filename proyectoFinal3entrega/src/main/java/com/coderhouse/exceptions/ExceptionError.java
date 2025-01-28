package com.coderhouse.exceptions;




public class ExceptionError extends Exception {

	private static final long serialVersionUID = 1L;
	
    public ExceptionError(String message) {
        super(message); 
    }

    
    public ExceptionError(String message, Throwable cause) {
        super(message, cause); 
    }
}