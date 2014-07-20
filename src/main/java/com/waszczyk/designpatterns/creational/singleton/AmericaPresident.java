package com.waszczyk.designpatterns.creational.singleton;


/*
 *  Singleton has three elements: 
 *  
 * 	+ private constructor - no other class can instantiate a new object.
	+ private reference - no external modification.
	+ public static method is the only place that can get an object.
 * 
 * 
 */
public class AmericaPresident {

	private static final AmericaPresident thePresident = new AmericaPresident();
	
	private AmericaPresident() {}
	
	public static AmericaPresident getPresident(){
		
		return thePresident;
	}
	
}
