package com.designpattern.prototype.reflectionapiversion;

public class SchedulerR {

	public static Time calculateEnd( Time start, int hours) throws TimeFactoryException {
		Time endTime = TimeFactory.getNewTimeObject(start);
		int hr = start.getHours() + hours;
		hr = hr < 24 ? hr : hr - 24;
		endTime.setTime(hr, start.getMinutes(), start.getSeconds());
		return endTime;
	}
}
