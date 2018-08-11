package com.designpattern.abstractfactory;

public class CDPlayer implements Player {
	
	CD cdInside;

	@Override
	public void accept(Media med) {
		cdInside = (CD) med;

	}

	@Override
	public void play() {
		if( cdInside == null )
			System.out.println("Error: no CD");
		else
			System.out.println(cdInside.readDisk());

	}

}
