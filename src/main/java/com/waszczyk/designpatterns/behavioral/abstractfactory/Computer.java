package com.waszczyk.designpatterns.behavioral.abstractfactory;

public class Computer {

	CPU cpu;
	
	public Computer(CPUFactory factory) {

		cpu = factory.produceCPU();
		cpu.process();
	}
}
