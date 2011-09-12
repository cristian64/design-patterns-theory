package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class MediumFunction implements Function {

	@Override
	public String getName() {
		return "MEDIUM";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Medium");
		return true;
	}    
}
