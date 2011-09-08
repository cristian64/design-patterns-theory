package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnOnFunction implements Function {

	@Override
	public String getName() {
		return "TURN_ON";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Turn On");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
