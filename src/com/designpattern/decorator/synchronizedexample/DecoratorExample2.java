package com.designpattern.decorator.synchronizedexample;

public class DecoratorExample2 {

	public static void main(String[] args) {
		System.out.println("Not synchronized point:");
		DiagonalDraggablePoint p = new SequentialPoint();
		PointDragger mp1 = new PointDragger(p, "Thread 1");
		PointDragger mp2 = new PointDragger(p, "Thread 2");
		Thread t1 = new Thread(mp1);
		Thread t2 = new Thread(mp2);
		t1.start();
		t2.start();
		while( t1.isAlive() || t2.isAlive());
		p.currentPosition();
		
		System.out.println("Synchronized point:");
		p = new SynchronizedPoint( new SequentialPoint());
		mp1 = new PointDragger(p, "Thread 1");
		mp2 = new PointDragger(p, "Thread 2");
		t1 = new Thread(mp1);
		t2 = new Thread(mp2);
		t1.start();
		t2.start();
		while( t1.isAlive() || t2.isAlive());
		p.currentPosition();

	}

}

class PointDragger implements Runnable{

	DiagonalDraggablePoint point;
	String name;
	
	public PointDragger(DiagonalDraggablePoint point, String name) {
		this.point = point;
		this.name = name;
	}
	
	@Override
	public void run() {
		for( int i = 0; i < 5; i++) {
			point.moveDiagonal(1, name);
		}
		
	}
	
}
