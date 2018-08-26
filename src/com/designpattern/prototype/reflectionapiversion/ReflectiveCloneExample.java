package com.designpattern.prototype.reflectionapiversion;

public class ReflectiveCloneExample {

	public static void main(String[] args) throws TimeFactoryException {
		// ***** Works with the TimeImplementationR1 class
		TimeImplementationR1 t1 = new TimeImplementationR1();
		t1.setTime(15, 20, 10);
		Time tEnd1 = SchedulerR.calculateEnd(t1, 6);
		System.out.print("End: " + tEnd1.getHours() + ":" + tEnd1.getMinutes() + ":" + tEnd1.getSeconds());
		// Prints the class name
		System.out.println("...using " + tEnd1.getClass());

		// ***** Works with the TimeImplementationR1 class
		TimeImplementationR2 t2 = new TimeImplementationR2();
		t2.setTime(15, 20, 10);
		Time tEnd2 = SchedulerR.calculateEnd(t2, 6);
		System.out.print("End: " + tEnd2.getHours() + ":" + tEnd2.getMinutes() + ":" + tEnd2.getSeconds());
		// Prints the class name
		System.out.println("...using " + tEnd2.getClass());
		
		//***** Loads a class specified by name (run-time)
		Time lastTime = TimeFactory.getNewTimeObject( "com.designpattern.prototype.reflectionapiversion.MaxTime" );
		System.out.print( "Max: " + lastTime.getHours() + ":" 
						  + lastTime.getMinutes() + ":" 
						  + lastTime.getSeconds());
		//Prints the class name
		System.out.println( "...using " + lastTime.getClass());
	}

}
