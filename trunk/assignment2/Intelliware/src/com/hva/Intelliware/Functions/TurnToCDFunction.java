package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class TurnToCDFunction implements Function {

	@Override
	public String getName() {
		return "TURN_TO_CD";		
	}

	@Override
	public boolean doFunction(String[] args) {
		System.out.println("Turn to CD");
		return true;
	}     
}
