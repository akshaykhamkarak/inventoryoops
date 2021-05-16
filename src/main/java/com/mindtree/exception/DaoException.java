package com.mindtree.exception;

import java.awt.event.FocusEvent.Cause;

import com.mindtree.dao.Dao;

public class DaoException extends Exception{
public DaoException() {
	super();
	
}
public DaoException(String message) {
	super(message);
}
public DaoException(String message, Throwable cause) {
	super(message,cause);
}

}
