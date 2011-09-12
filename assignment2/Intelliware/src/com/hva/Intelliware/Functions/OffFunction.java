package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class OffFunction implements Function {

	@Override
	public String getName() {
		return "OFF";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Turn Off");
		return true;
	}   
}
