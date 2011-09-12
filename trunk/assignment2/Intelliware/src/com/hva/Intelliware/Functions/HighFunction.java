package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class HighFunction implements Function {

	@Override
	public String getName() {
		return "HIGH";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("High");
		return true;
	}    
}
