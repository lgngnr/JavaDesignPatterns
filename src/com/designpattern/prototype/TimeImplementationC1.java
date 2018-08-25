package com.designpattern.prototype;

public class TimeImplementationC1 extends CloneableTime{

	private int hr, min, sec;
	
	public void setTime( int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	
	public int getHours() {
		return hr;
	}
	
	public int getMinutes() {
		return min;
	}
	
	public int getSeconds() {
		return sec;
	}
}
