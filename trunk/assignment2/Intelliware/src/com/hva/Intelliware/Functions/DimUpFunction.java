package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class DimUpFunction implements Function {

	@Override
	public String getName() {
		return "DIMUP";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Dim Up");
		return true;
	}    
}
