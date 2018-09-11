package com.designpattern.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	public static final boolean SECURE_MODE_ON = true;
	public static final boolean SECURE_MODE_OFF = false;
	
	BufferedReader br;
	boolean secureMode;
	
	public ConsoleReader() {
		this( SECURE_MODE_ON);
	}

	public ConsoleReader(boolean secureMode) {
		br = new BufferedReader( new InputStreamReader( System.in));
		this.secureMode = secureMode; 
	}
	
	public String readString() {
		try {
			return br.readLine();
		} catch (IOException e) {
			if( secureMode)
				throw new ConsoleReaderException(e);
			return "";
		}
	}
	
	public Integer readInteger() {
		Integer theInteger =  null;
		try {
			theInteger = new Integer( br.readLine());
		} catch (Exception e) {
			if( secureMode)
				throw new ConsoleReaderException(e);
			theInteger = new Integer(0);
		}
		return theInteger;
	}
	
	public Double readDouble() {
		Double theDouble = null;
		try {
			theDouble = new Double( br.readLine());
		} catch (Exception e) {
			if( secureMode)
				throw new ConsoleReaderException(e);
			theDouble = new Double(0);
		} 
		return theDouble;
	}
}
