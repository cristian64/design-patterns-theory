package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class DisarmFunction implements Function {

	@Override
	public String getName() {
		return "DISARM";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Disarm Security");
		return true;
	}    
}
