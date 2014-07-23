package com.waszczyk.designpatterns.creational.factory;

public class HumanFactory {

	public static Human createHuman(String m){
		
		Human p = null;
		
		if(m == "boy"){
			p = new Boy();
		}else if(m == "girl"){
			
			p = new Girl();
		}
		
		return p;
	}
}
