package com.designpattern.singleton;

public class PrintSpoolerMain {

	public static void main(String[] args) {
		PrintSpooler printer = PrintSpooler.getIstance();
		printer.print("message printed");
	}

}
