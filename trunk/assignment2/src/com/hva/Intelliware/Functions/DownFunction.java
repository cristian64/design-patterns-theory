package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class DownFunction implements Function {

	@Override
	public String getName() {
		return "DOWN";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Down");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
