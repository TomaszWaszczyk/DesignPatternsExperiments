package com.waszczyk.designpatterns.behavioral.strategy;

public class HardPolice implements Strategy{

	public void processSpeeding(int speed) {
		
		System.out.println("You got a ticket ;-)");
	}

}
