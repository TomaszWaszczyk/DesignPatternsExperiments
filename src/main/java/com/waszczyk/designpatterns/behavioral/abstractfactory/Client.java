package com.waszczyk.designpatterns.behavioral.abstractfactory;

public class Client {
	public static void main(String[] args) {
		
		new Computer(createSpecificFactory());
	}
	
	public static CPUFactory createSpecificFactory(){
		
		int sys = 0;
		if(sys == 0)
			return new AMDFactory();
		else
			return new IntelFactory();
	}
}
