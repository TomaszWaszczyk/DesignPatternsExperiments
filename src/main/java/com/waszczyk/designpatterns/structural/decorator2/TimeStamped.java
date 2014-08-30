package com.waszczyk.designpatterns.structural.decorator2;

import java.util.Date;

public class TimeStamped extends Decorator{

	private final long timeStamp;
	
	public TimeStamped(Basic basic){
		
		super(basic);
		timeStamp = new Date().getTime();
	}
	
	public long getStamp(){
		return timeStamp;
	}
	
}
