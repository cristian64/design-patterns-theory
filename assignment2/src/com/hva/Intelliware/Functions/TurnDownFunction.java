package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnDownFunction implements Function {

	@Override
	public String getName() {
		return "TURN_DOWN";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Turn Down");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
