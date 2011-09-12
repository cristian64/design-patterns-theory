package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class StopFunction implements Function {

	@Override
	public String getName() {
		return "STOP";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Stop");
		return true;
	}      
}
