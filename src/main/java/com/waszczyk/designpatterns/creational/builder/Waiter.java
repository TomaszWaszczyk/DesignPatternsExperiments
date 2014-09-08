package com.waszczyk.designpatterns.creational.builder;

class Waiter {
	private StarbucksBuilder starbucksBuilder;
 
	public void setStarbucksBuilder(StarbucksBuilder builder) {
		starbucksBuilder = builder;
	}
 
	public Starbucks getstarbucksDrink() {
		return starbucksBuilder.getStarbucks();
	}
 
	public void constructStarbucks() {
		starbucksBuilder.createStarbucks();
		starbucksBuilder.buildDrink();
		starbucksBuilder.buildSize();
	}
}
