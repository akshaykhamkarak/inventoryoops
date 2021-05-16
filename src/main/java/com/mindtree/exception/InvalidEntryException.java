package com.mindtree.exception;

public class InvalidEntryException extends Exception{
public InvalidEntryException() {
	super();
}
public InvalidEntryException(String message) {
	super(message);
}
public InvalidEntryException(String message,Throwable throwable) {
	super(message,throwable);
}
}
