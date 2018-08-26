package com.designpattern.prototype.reflectionapiversion;

public class TimeFactoryException extends Exception{

	public TimeFactoryException( Exception e) {
		super( e.getMessage());
	}
}
