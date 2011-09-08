package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnUpFunction implements Function {

	@Override
	public String getName() {
		return "UP";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Up");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
