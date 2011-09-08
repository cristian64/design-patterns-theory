package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnOffFunction implements Function {

	@Override
	public String getName() {
		return "TURN_OFF";		
	}

	@Override
    public boolean doFunction() {
        System.out.println("Turn Off");
        return true;
    }
	
	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
