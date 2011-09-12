package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class JetsOffFunction implements Function {

	@Override
	public String getName() {
		return "JETS_OFF";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Jets Off");
		return true;
	}    
}
