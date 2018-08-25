package com.designpattern.factorymethod;

public class PlaceHandler extends ElementHandler {

	@Override
	public MapElement newElement() {
		return new Place();
	}
}
