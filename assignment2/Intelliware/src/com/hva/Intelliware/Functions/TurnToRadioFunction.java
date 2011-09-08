package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnToRadioFunction implements Function {

	@Override
	public String getName() {
		return "TURN_TO_RADIO";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Turn to Radio");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
