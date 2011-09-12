package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnUpFunction implements Function {

	@Override
	public String getName() {
		return "UP";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Turn Up");
		return true;
	}     
}
