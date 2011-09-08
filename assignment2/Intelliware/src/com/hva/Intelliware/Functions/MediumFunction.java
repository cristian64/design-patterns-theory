package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class MediumFunction implements Function {

	@Override
	public String getName() {
		return "MEDIUM";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Medium");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
