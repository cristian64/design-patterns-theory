package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class LightOnFunction implements Function {

	@Override
	public String getName() {
		return "LIGHT_ON";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Light On");
		return true;
	}    
}
