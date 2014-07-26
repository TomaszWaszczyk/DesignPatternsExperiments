package com.waszczyk.designpatterns.behavioral.abstractfactory;

public class IntelFactory implements CPUFactory{

	public CPU produceCPU() {

		return new IntelCPU();
	}

}
