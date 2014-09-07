package com.waszczyk.designpatterns.behavioral.strategy2;

public class Traveler {

	private TypeOfTransport typeOfTransport;
	
	public Traveler() {
	
//		here can be lots of possibilities
		typeOfTransport = new Bike();
		typeOfTransport = new Auto();
		
	}
	public static void main(String[] args) {
		
		Traveler tomek = new Traveler();
	}
}
