package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class JetsOnFunction implements Function {

	@Override
	public String getName() {
		return "JETS_ON";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Jets On");
		return true;
	}      
}
