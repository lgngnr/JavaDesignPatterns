package com.designpattern.bridge;

import java.util.Collection;

public class CompleteMatrix extends Matrix {

	protected CompleteMatrix(int rows, int cols, Collection collection) {
		super(rows, cols, collection);
		for( int i = 0; i < rows; i++ )
			for( int j = 0; j < cols; j++)
				createPosition( i, j);
	}

	@Override
	public void put(int row, int col, int value) throws MatrixIndexOutBoundsException {
		MatrixCell cell = getPosition(row, col);
		cell.value = value;
		
	}

	@Override
	public int get(int row, int col) throws MatrixIndexOutBoundsException {
		MatrixCell cell = getPosition(row, col);
		return cell.value;
		
	}

	
}
