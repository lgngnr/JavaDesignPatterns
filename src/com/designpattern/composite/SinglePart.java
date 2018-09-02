package com.designpattern.composite;

public class SinglePart extends Component{

	public SinglePart(String name) {
		super(name);
	}
	
	public void describe() {
		System.out.println("Component: " + name);
	}

}
