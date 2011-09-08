package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class CloseCrankFunction implements Function{

	@Override
	public String getName() {
		return "CLOSE_CRANK";
	}

	@Override
	public boolean doFunction() {
		System.out.println("Close Crank");
		return true;
	}

	@Override
	public boolean doFunction(String value) {
		return doFunction();
	}
	
}
