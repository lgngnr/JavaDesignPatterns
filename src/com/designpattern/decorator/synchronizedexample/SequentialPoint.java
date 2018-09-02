package com.designpattern.decorator.synchronizedexample;

//**** Not thread safe, another thread can update x,y 
//**** meanwhile moveDiagonal being executed

public class SequentialPoint implements DiagonalDraggablePoint {
	
	private int x, y;

	@Override
	public void moveDiagonal(int distance, String draggerName) {
		int aux = x + distance;
		System.out.println( "Moved by " + draggerName
							+ " - Origin x=" + x + " y=" + y);
		x = aux;
		y = y + distance;
	}

	@Override
	public void currentPosition() {
		System.out.println( "Current position : x=" + x + " y=" + y);
	}

}
