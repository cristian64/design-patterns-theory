package com.hva.Intelliware.Functions;

import com.hva.Intelliware.Function;


public class SetInputChannelFunction implements Function {

	@Override
	public String getName() {
		return "SETINPUTCHANNEL";		
	}
	
	@Override
	public boolean doFunction(String[] args) {
		// function requires integer value, attempt conversion		
		if (args.length < 0) {
			return false; 
		} else {
			System.out.println("Input channel set to " + args[0]);
			return true;
		}
	}  
	
}
