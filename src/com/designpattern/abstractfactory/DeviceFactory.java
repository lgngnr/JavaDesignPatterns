package com.designpattern.abstractfactory;

public interface DeviceFactory {
	public Player createPlayer();
	public Recorder createRecorder();
	public Media createMedia();
}
