package com.waszczyk.designpatterns.behavioral.strategy2;

public class Bike implements TypeOfTransport{

	public void go() {

		lotsOfEat();
		relaxAndPedal();
	}


	private void lotsOfEat() {

		System.out.println("Amniam mniam mniam");
	}

	private void relaxAndPedal() {

		System.out.println("Hard work and big muscles ;D");
	}
}
