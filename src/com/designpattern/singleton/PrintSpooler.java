package com.designpattern.singleton;

public class PrintSpooler {
	
	private static PrintSpooler istance;
	
	private PrintSpooler() {}
	
	public static PrintSpooler getIstance() {
		if( istance == null )
			istance = new PrintSpooler();
		return istance;
	}
	
	public void print( String msg) {
		System.out.println(msg);
	}
}
