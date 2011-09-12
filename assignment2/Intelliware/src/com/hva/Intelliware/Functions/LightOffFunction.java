package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class LightOffFunction implements Function {

	@Override
	public String getName() {
		return "LIGHT_OFF";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Light Off");
		return true;
	}      
}
