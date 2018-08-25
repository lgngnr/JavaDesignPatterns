package com.designpattern.factorymethod;

public class Connector implements MapElement {

	private String connectorLabel;
	Place place1, place2;
	
	@Override
	public void setLabel(String label) {
		connectorLabel = label;
	}
	
	public void setPlacesConnected(Place origin, Place destination) {
		place1 = origin;
		place2 = destination;
	}

	@Override
	public String getPaintingData() {
		return connectorLabel + " [from " +
				place1.getPaintingData() + " to " +
				place2.getPaintingData() + "]";
	}

}
