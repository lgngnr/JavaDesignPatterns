package com.designpattern.abstractfactory;

public class Tape implements Media {
	private String tape = "";
	
	public void saveOnTape( String sound ) {
		tape = sound;
	}
	
	public String readTape() {
		return tape;
	}
}
