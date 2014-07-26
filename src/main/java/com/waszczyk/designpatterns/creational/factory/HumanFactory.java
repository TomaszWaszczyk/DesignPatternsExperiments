package com.waszczyk.designpatterns.creational.factory;

public class HumanFactory {

	public static Human createHuman(String m){
		
		Human p = null;
		
		if(m == "boy"){
			p = new Boy();
			System.out.println("boy was created");
		}else if(m == "girl"){
			
			p = new Girl();
			System.out.println("very nice girl was just created ;-)");
		}
		
		return p;
	}
}
