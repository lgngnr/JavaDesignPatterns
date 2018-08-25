package com.designpattern.prototype;

public class PrototypeCloneExample {
	public static void main( String[] args) throws CloneNotSupportedException {
		System.out.println("Using TimeImplementationC1: ");
		CloneableTime t1 = new TimeImplementationC1();
		t1.setTime(15, 20, 10);
		CloneableTime tEnd1 = SchedulerC.calculateEnd( t1, 6);
		System.out.println( "End: " + tEnd1.getHours() + ":" +
				tEnd1.getMinutes() + ":" + tEnd1.getSeconds());
		System.out.println("Using TimeImplementationC2: ");
		CloneableTime t2 = new TimeImplementationC2();
		t2.setTime(10, 15, 35);
		CloneableTime tEnd2 = SchedulerC.calculateEnd( t2, 6);
		System.out.println( "End: " + tEnd2.getHours() + ":" +
				tEnd2.getMinutes() + ":" + tEnd2.getSeconds());
	}
}
