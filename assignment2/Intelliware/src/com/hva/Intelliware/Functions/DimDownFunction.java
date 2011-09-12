package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class DimDownFunction implements Function {

	@Override
	public String getName() {
		return "DIMDOWN";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Dim Down");
		return true;
	}     
}
