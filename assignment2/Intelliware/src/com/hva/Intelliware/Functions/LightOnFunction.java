package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class LightOnFunction implements Function {

	@Override
	public String getName() {
		return "LIGHT_ON";		
	}

	@Override
    public boolean doFunction() {
        System.out.println("Light On");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
