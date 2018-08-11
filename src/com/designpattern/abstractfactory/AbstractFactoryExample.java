package com.designpattern.abstractfactory;

public class AbstractFactoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		Client client = new Client();
		
		System.out.println("Testing Tape devices ");
		client.setTechnology( new TapeDeviceFactory() );
		client.test("I wanna hold you hand...");
		
		System.out.println("Testing CD devices ");
		client.setTechnology( new TapeDeviceFactory() );
		client.test("Fly me to the moon...");
	}

}
