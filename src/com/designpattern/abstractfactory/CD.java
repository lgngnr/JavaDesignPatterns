package com.designpattern.abstractfactory;

public class CD implements Media {

	private String track = "";
	
	public void writeOnDisk( String sound ) {
		track =  sound;
	}
	
	public String readDisk() {
		return track;
	}
}
