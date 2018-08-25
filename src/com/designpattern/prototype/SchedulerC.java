package com.designpattern.prototype;

public class SchedulerC {
	
	public static CloneableTime calculateEnd( CloneableTime start, int hours) throws CloneNotSupportedException {
		int hr = start.getHours() + hours;
		hr = hr < 24 ? hr : hr - 24;
		CloneableTime endTime = start.cloneItSelf();
		endTime.setTime( hr, start.getMinutes(), start.getSeconds());
		return endTime;
	}

}
