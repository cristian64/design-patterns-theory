package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class LowFunction implements Function {

	@Override
	public String getName() {
		return "LOW";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Low");
		return true;
	}    
}
