package com.designpattern.prototype;

public class TimeImplementationC2 extends CloneableTime{

	private int secs;
	
	public void setTime( int hr, int min, int sec) {
		secs = hr * 3600 + min * 60 + sec;
	}
	
	public int getHours() {
		return secs / 3600;
	}
	
	public int getMinutes() {
		return  (secs - (getHours()*3600)) / 60;
	}
	
	public int getSeconds() {
		return secs - ( getHours() * 3600) - ( getMinutes() * 60);
	}
}
