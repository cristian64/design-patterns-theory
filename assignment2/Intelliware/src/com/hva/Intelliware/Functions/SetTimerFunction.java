package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class SetTimerFunction implements Function {

	@Override
	public String getName() {
		return "SET_TIMER";		
	}

	@Override
	public boolean doFunction(String[] args) {
		// function requires integer value, attempt conversion
		try {
			int i = Integer.parseInt(args[0]);
			System.out.println("Timer set to " + i);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}  
	
}
