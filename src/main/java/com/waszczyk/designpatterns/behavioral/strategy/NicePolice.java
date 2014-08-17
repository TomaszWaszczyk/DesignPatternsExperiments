package com.waszczyk.designpatterns.behavioral.strategy;

public class NicePolice implements Strategy{

	public void processSpeeding(int speed) {

		System.out.println("This is your first time, be sure do not it again!");
	}
	
}
