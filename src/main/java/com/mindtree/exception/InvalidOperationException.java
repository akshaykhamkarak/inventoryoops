package com.mindtree.exception;

import java.util.InputMismatchException;

public class InvalidOperationException extends Exception {

	public InvalidOperationException() {
		super();
	}
	
	public InvalidOperationException(String message) {
		super(message);
	}
public InvalidOperationException(Throwable throwable) {
	super(throwable);
}
public InvalidOperationException(String message,Throwable throwable) {
	super(message,throwable);
}
	
}
