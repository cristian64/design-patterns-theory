package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class DimUpFunction implements Function {

	@Override
	public String getName() {
		return "DIMUP";		
	}

	@Override
    public boolean doFunction() {
		System.out.println("Dim Up");
        return true;
    }

	@Override
	public boolean doFunction(String value) {
		return doFunction();		
	}    
}
