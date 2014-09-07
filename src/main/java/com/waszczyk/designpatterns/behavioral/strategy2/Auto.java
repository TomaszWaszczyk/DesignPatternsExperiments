package com.waszczyk.designpatterns.behavioral.strategy2;

public class Auto implements TypeOfTransport{

	public void go() {

		turnTheKey();
		lowGear();
	}

	private void turnTheKey() {

		System.out.println("Brum brum brum ");
	}

	private void lowGear() {

		System.out.println("wrrrrrrrrrrrrr gooooooooo");
		
	}
}
