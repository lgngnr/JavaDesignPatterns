package com.designpattern.decorator.synchronizedexample;

public class SynchronizedPoint implements DiagonalDraggablePoint {
	
	DiagonalDraggablePoint theSequentialPoint;
	
	public SynchronizedPoint( DiagonalDraggablePoint theSequentialPoint) {
		this.theSequentialPoint = theSequentialPoint;
	}

	@Override
	public void moveDiagonal(int distance, String draggerName) {
		synchronized (theSequentialPoint) {
			theSequentialPoint.moveDiagonal(distance, draggerName);
		}
	}

	@Override
	public void currentPosition() {
		theSequentialPoint.currentPosition();
	}

}
