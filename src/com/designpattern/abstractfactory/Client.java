package com.designpattern.abstractfactory;

public class Client {
	DeviceFactory technology;
	
	public void setTechnology( DeviceFactory df ) {
		technology = df;
	}
	
	public void test( String song) {
		Media media = technology.createMedia();
		Recorder recorder = technology.createRecorder();
		Player player = technology.createPlayer();
		
		recorder.accept(media);
		System.out.println("Recording the song: " + song);
		recorder.record(song);
		System.out.println("Listenting the song: ");
		player.accept( media );
		player.play();
	}

}
