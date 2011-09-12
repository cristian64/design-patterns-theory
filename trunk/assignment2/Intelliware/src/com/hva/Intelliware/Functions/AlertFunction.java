package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class AlertFunction implements Function {

	@Override
	public String getName() {
		return "ALERT";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Sound Alarm");
		return true;
	}   
}
