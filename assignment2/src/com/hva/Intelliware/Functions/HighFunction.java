package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class HighFunction implements Function {

	@Override
	public String getName() {
		return "HIGH";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Stop");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
