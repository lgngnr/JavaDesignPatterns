package com.designpattern.flyweight;

import java.util.Hashtable;

public class EventSymbolFactory {

	private static Hashtable events =  new Hashtable();

	public static EventSymbol newEventSymbol( String event) {
		EventSymbol eventRef = (EventSymbol) events.get(event);
		if( eventRef == null) {
			eventRef =  new EventSymbol(event);
			events.put(event, eventRef);
		}
		return eventRef;
	}
}
