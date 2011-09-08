package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class UpFunction implements Function {

	@Override
	public String getName() {
		return "TURN_UP";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Turn Up");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
