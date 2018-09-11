package com.designpattern.facade;

public class FacadeExample {

	public static void main( String[] args) {
		
		ConsoleReader reader = new ConsoleReader( ConsoleReader.SECURE_MODE_OFF);
		
		System.out.println("This is the Insecure Mode: the system can't detect invalid input");
		System.out.println( "Enter a string: ");
		String text = reader.readString();
		System.out.println("You wrote: " + text);
		
		System.out.println( "Enter an Integer: ");
		Integer oInteger = reader.readInteger();
		System.out.println("You wrote: " + oInteger);
		
		System.out.println( "Enter a Double: ");
		Double oDouble = reader.readDouble();
		System.out.println("You wrote: " + oDouble);
		
		System.out.println("This is the Secure Mode: the system saise an exception when it detect invalid input");
		
		reader = new ConsoleReader( ConsoleReader.SECURE_MODE_ON);
		
		System.out.println("This is the Insecure Mode: the system can't detect invalid input");
		System.out.println( "Enter a string: ");
		text = reader.readString();
		System.out.println("You wrote: " + text);
		
		System.out.println( "Enter an Integer: ");
		oInteger = reader.readInteger();
		System.out.println("You wrote: " + oInteger);
		
		System.out.println( "Enter a Double: ");
		oDouble = reader.readDouble();
		System.out.println("You wrote: " + oDouble);
	}
}
