package com.designpattern.factorymethod;

public class Place implements MapElement {

	private String placeLabel;
	
	@Override
	public void setLabel(String label) {
		placeLabel = label;
	}

	@Override
	public String getPaintingData() {
		return "city: " + placeLabel;
	}

}
