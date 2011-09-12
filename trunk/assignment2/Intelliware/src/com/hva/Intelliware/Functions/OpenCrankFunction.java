package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class OpenCrankFunction implements Function{

	@Override
	public String getName() {
		return "OPEN_CRANK";
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Open Crank");
		return true;
	}   
	
}
