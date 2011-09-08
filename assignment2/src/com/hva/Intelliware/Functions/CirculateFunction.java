package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class CirculateFunction implements Function {

	@Override
	public String getName() {
		return "CIRCULATE";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Circulate");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
