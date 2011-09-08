package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class LowFunction implements Function {

	@Override
	public String getName() {
		return "LOW";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Low");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
