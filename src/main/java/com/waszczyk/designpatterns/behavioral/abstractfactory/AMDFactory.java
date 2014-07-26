package com.waszczyk.designpatterns.behavioral.abstractfactory;

public class AMDFactory implements CPUFactory{

	public CPU produceCPU() {
		
		return new AMDCPU();
	}
 
}
