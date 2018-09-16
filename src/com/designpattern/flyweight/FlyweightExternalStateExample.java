package com.designpattern.flyweight;

public class FlyweightExternalStateExample {

	public static void main(String[] args) {
		System.out.println("Exemplifies the external state usage.");
		EventSymbol evnt;
		for( int i = 0; i < 10; i++) {
			String owner = Math.random() < 0.5 ? "Generator A" : "Generator B";
			Double r = Math.random();
			if( r < 0.3)
				evnt = EventSymbolFactory.newEventSymbol("EVENT 1");
			else if( r < 0.6)
				evnt = EventSymbolFactory.newEventSymbol("EVENT 2");
			else 
				evnt = EventSymbolFactory.newEventSymbol("EVENT 3");
			evnt.print(owner);
		}
	}

}
