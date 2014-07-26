package com.waszczyk.designpatterns.creational.factory;

public class TestFactory {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		HumanFactory hf = new HumanFactory();
		hf.createHuman("girl");
		
	}

}
