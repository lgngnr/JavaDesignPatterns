package com.designpattern.abstractfactory;

public class CDRecorder implements Recorder {
	
	CD cdInside;

	@Override
	public void accept(Media med) {
		cdInside = (CD) med;

	}

	@Override
	public void record(String sound) {
		if( cdInside ==  null )
			System.out.println( "Error: noCD." );
		else cdInside.writeOnDisk(sound);
	}

}
