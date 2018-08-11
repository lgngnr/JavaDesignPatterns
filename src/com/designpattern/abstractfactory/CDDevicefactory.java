package com.designpattern.abstractfactory;

public class CDDevicefactory implements DeviceFactory {

	@Override
	public Player createPlayer() {
		return new CDPlayer();
	}

	@Override
	public Recorder createRecorder() {
		return new CDRecorder();
	}

	@Override
	public Media createMedia() {
		return new CD();
	}

}
