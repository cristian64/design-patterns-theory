package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;

public class ArmFunction implements Function {

	@Override
	public String getName() {
		return "ARM";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Arm Security");
		return true;
	}    
}
