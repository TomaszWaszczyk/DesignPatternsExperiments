package com.waszczyk.designpatterns.structural.decorator2;

public class SerialNumbered extends Decorator{

	private static long counter = 1;
	private final long serialNumber = counter++;
	public SerialNumbered(Basic basic){
		super(basic);
	}
	
	public long getSerialNumber(){
		return serialNumber;
	}
}
